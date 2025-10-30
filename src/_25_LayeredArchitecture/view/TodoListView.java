package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private final TodoService todoService;
    private Scanner scanner;
    private User principal;
    private UserService userService;

    public TodoListView(UserService userService, TodoService todoService){
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }

    public void homeView(){
        while (true){
            System.out.println("[ Todo List ]");
            System.out.println("1. TodoList");
            if (principal == null){
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            }else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">>>");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            }else if("1".equals(cmd)){
                // TodoList 관리
                if (principal == null){
                    System.out.println("로그인 후 사용 가능합니다,");
                    continue;
                }
                todoListMenuView();
            }else if ("2".equals(cmd) && principal == null){
                // 회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                //로그인 아웃
                principal = null;
                System.out.println("==== login Out ====");
            } else if ("3".equals(cmd) && principal == null) {
                //로그인
                signinView();
            } else {
                System.out.println("잘못입력하였습니다.");
            }
        }
    }

    //회원가입 뷰
    public void signupView(){
        System.out.println("[ 회원가입 ]");

        //중복확인
        String username = null;
        while (true) {
            System.out.print("username: ");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) {//중복이 되지 않았을때
                System.out.println("사용 가능한 username 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username 입니다.");
        }

        System.out.println("password: ");
        String password = scanner.nextLine();

        System.out.println("name: ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
            //userService의 회원가입 로직에 signupReqDto 전달
        userService.signup(signupReqDto);
        System.out.println("====회원가입 완료 ====");

            //조회를할 수 있는 로직
        userService.printAllUserList();


    }

    public void signinView(){
        System.out.println("[ 로그인 ]");
        System.out.println("username >>>  ");
        String username = scanner.nextLine();
        System.out.println("password >>> ");
        String password = scanner.nextLine();
        SigninReqDto signinReqDto = new SigninReqDto(username, password);
        User foundUser = userService.signin(signinReqDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인해주세요.");
            return;
        }
        principal = foundUser;
        System.out.println("===== login good! =====");
    }

    public void todoListMenuView(){
        while (true){
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">>>");
            String cmd = scanner.nextLine();


            System.out.println(" Todo 등록 완료!\n");


            if ("b".equals(cmd)){
                break;
            }else if ("1".equals(cmd)){
                System.out.println("[ Todo 등록 ]");
                System.out.println("내용 입력하시요 >>> ");
                String contents = scanner.nextLine();
                //LocalDateTime.now()
            } else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");

                Todo[] todos = todoService.getTodosByUserId(principal.getUserId());

                if (todos.length == 0) {
                    System.out.println("등록된 Todo가 없습니다.\n");
                    continue;
                }

                for (Todo todo : todos) {
                    System.out.println(todo.getTodoId() + ". " + todo.getContents() +
                            " (" + todo.getCreateDt() + ")");
                }
                System.out.println();

            } else {
                System.out.println("잘못 입력하였습니다.");

            }
        }
    }
}
