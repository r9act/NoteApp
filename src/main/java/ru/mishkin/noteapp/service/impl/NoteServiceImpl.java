package ru.mishkin.noteapp.service.impl;

import org.springframework.stereotype.Service;
import ru.mishkin.noteapp.model.Note;
import ru.mishkin.noteapp.repo.impl.NoteRepoImpl;
import ru.mishkin.noteapp.service.NoteService;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepoImpl noteRepo;

    public NoteServiceImpl(NoteRepoImpl noteRepo) {
        this.noteRepo = noteRepo;
    }

    @Override
    public Note addNote(Note note) {
        noteRepo.addNote(note);
        return note;
    }

    @Override
    public Note getNote(Integer id) {
        return noteRepo.getNoteById(id);
    }


    @Override
    public List<Note> getAllNotes() {
        return noteRepo.getAllNotes();
    }
}
