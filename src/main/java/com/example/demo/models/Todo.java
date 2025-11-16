package com.example.demo.models;

public class Todo {

    private int id;
    private String title;
    private boolean isDone;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
        isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }
}
