package ru.mishkin.noteapp.repo;

import ru.mishkin.noteapp.model.Note;

import java.util.List;

public interface NoteRepo {

    void addNote(Note note);

    Note getNoteById(Integer id);

    List<Note> getAllNotes();
}
