package _25_LayeredArchitecture.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {
    private int todoId; //고유 아이디
    private String contents;// 할 일 내용
    private User user;// 작성자 명
    private LocalDateTime createDt;// 생성 시각
}
