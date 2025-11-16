package com.example.demo;

import com.example.demo.models.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodoListTests {

    @Test
    public void todoShouldNotBeNull(){
        var todoList = new TodoList();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> todoList.createTodo(null)
        );
    }

    @Test
    public void todoShouldNotBeEmpty(){
        var todoList = new TodoList();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> todoList.createTodo("")
        );
    }

    @Test
    public void todoShouldNotHaveLessThanFiveCharacters(){
        var todoList = new TodoList();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> todoList.createTodo("Hall")
        );
    }

    @Test
    public void todoListShouldBeEmptyInitially(){
        var todoList = new TodoList();
        var todos = todoList.getTodos();
        Assertions.assertEquals(0,todos.size());
    }

    @Test
    public void todoShouldBeAddedToList(){
        var todoList = new TodoList();
        todoList.createTodo("Fitness");
        var todos = todoList.getTodos();
        Assertions.assertEquals(1, todos.size());

    }

    @Test
    public void todoShouldContainCorrectTitle(){
        TodoList todoList = new TodoList();
        todoList.createTodo("Fitness");
        List<Todo> todos = todoList.getTodos();
        Todo todo = todos.get(0);
        String title = todo.getTitle();
        Assertions.assertEquals("Fitness", title);
    }

    @Test
    public void shouldMarkATodoAsDone(){
        TodoList todoList = new TodoList();
        todoList.createTodo("Apfel scheiden");
        List<Todo> todos = todoList.getTodos();
        Todo todo = todos.get(0);
        todo.markAsDone();
        boolean isDone = todo.isDone();
        Assertions.assertTrue(isDone);
    }
}
