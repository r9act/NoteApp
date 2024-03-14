package ru.mishkin.noteapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mishkin.noteapp.model.Note;
import ru.mishkin.noteapp.service.impl.NoteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private final NoteServiceImpl noteService;

    public MyController(NoteServiceImpl noteService) {
        this.noteService = noteService;
    }


    @GetMapping("/create")
    public Note createNewNote(@RequestParam("text") String text) {
        Note note = new Note(text);
        noteService.addNote(note);
        return note;
    }

    @GetMapping("/note")
    public Note getNote(@RequestParam("id") Integer id) {
        return noteService.getNote(id);
    }

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
}
