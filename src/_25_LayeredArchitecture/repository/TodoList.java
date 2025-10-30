package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0]; // 초기엔 비어 있는 배열
    }

    public Todo[] getAllTodos() {
        return todos;
    }

    public Todo findByTodoId(int todoId) {
        for (Todo todo : todos) {
            if (todo.getTodoId() == todoId) {
                return todo;
            }
        }
        return null;
    }


    public Todo[] findByUserId(int userId) {
        int count = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getUserId() == userId) {
                count++;
            }
        }

        Todo[] userTodos = new Todo[count];
        int idx = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getUserId() == userId) {
                userTodos[idx++] = todo;
            }
        }
        return userTodos;
    }


    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }

    public void add(Todo todo) {
        Todo[] newTodos = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            newTodos[i] = todos[i];
        }
        newTodos[newTodos.length - 1] = todo;
        todos = newTodos;
    }
}
