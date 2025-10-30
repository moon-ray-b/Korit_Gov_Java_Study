package _25_LayeredArchitecture.dto;

import _25_LayeredArchitecture.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class TodoRegisterReqDto {
    private String contents; // 작성할 내용
    private User user; // 작성자 정보
}
