package ru.mishkin.noteapp.service;

import ru.mishkin.noteapp.model.Note;

import java.util.List;

public interface NoteService {

    Note addNote(Note note);

    Note getNote(Integer id);

    List<Note> getAllNotes();
}
