package _25_LayeredArchitecture.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SigninReqDto {
    private String username;
    private String password;
}
