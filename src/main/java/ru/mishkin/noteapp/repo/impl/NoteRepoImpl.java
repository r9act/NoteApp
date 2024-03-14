package ru.mishkin.noteapp.repo.impl;

import org.springframework.stereotype.Component;
import ru.mishkin.noteapp.model.Note;
import ru.mishkin.noteapp.repo.NoteRepo;

import java.util.ArrayList;
import java.util.List;

@Component
public class NoteRepoImpl implements NoteRepo {

    List<Note> list = new ArrayList<>();

    public void addNote(Note note) {
        list.add(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return new ArrayList<>(list);
    }

    @Override
    public Note getNoteById(Integer id) {
        for (Note note : list) {
            if (note.getId().equals(id)) {
                return note;
            }
        }
        return null;
    }

}
