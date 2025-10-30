package _25_LayeredArchitecture.dto;

import _25_LayeredArchitecture.entity.User;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class SignupReqDto {
    private String username;
    private String password;
    private String name;

    public User toEntity() {
        return User.builder()
                .userId(0)
                .username(username)
                .password(password)
                .name(name)
                .build();
    }
}
