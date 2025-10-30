package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.repository.TodoList;
import java.time.LocalDateTime;


public class TodoService {

    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }
    public void add(TodoRegisterReqDto todoReq) {
        int newTodoId = todoList.generateTodoId();

        Todo newTodo = new Todo(
                newTodoId,
                todoReq.getContents(),
                todoReq.getUser(),
                LocalDateTime.now()
        );

        todoList.add(newTodo);
    }
    public Todo[] getTodosByUserId(int userId) {
        return todoList.findByUserId(userId);
    }

    public void registerTodo(TodoRegisterReqDto dto) {
        Todo todo = new Todo(
                todoList.generateTodoId(),   // 자동 ID 생성
                dto.getContents(),           // 내용
                dto.getUser(),               // 작성자
                LocalDateTime.now()          // 생성 시간
        );
        todoList.add(todo);
        System.out.println(" [등록 완료] " + todo.getContents());
    }

    public void showMyTodos(int userId) {
        Todo[] todos = todoList.findByUserId(userId);
        if (todos.length == 0) {
            System.out.println(" 등록된 Todo가 없습니다.");
            return;
        }

        System.out.println("📋 [내 Todo 목록]");
        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }


    public void showTodoDetail(int todoId) {
        Todo todo = todoList.findByTodoId(todoId);
        if (todo == null) {
            System.out.println("️ 해당 Todo를 찾을 수 없습니다.");
            return;
        }
        System.out.println(" [Todo 상세 보기]");
        System.out.println(todo);
    }
}

