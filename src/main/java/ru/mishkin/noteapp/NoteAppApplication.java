package ru.mishkin.noteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.mishkin.noteapp.model.Note;
import ru.mishkin.noteapp.repo.NoteRepo;
import ru.mishkin.noteapp.repo.impl.NoteRepoImpl;

@SpringBootApplication
public class NoteAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteAppApplication.class, args);

    }

}
