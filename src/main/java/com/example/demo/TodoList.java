package com.example.demo;

import com.example.demo.models.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> todos = new ArrayList<>();

    public void createTodo(String title){
        if(title == null){
            throw new IllegalArgumentException();
        }
        if(title.isEmpty()){
            throw new IllegalArgumentException();
        }
        if(title.length() < 5){
            throw new IllegalArgumentException();
        }
        var todo = new Todo(todos.size(), title);
        todos.add(todo);
    }



    public List<Todo> getTodos(){

        return todos;
    }
}
