package ru.mishkin.noteapp.model;


import java.time.LocalDateTime;

public class Note {
    private Integer id;
    private String text;
    private LocalDateTime timeCreated;
    private Boolean isCompleted;

    private static Integer counter = 0;


    public Note(String text) {
        this.id = counter;
        counter++;
        this.text = text;
        this.timeCreated = LocalDateTime.now();
        this.isCompleted = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", timeCreated=" + timeCreated +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
