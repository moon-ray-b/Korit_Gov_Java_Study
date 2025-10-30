package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.repository.TodoList;

public class TodoService {
    private TodoList todoList;

    public  TodoService(TodoList todoList){
        this.todoList = todoList;
    }
}
