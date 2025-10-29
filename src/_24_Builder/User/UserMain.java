package _24_Builder.User;

/*
 * int userId;
 * String username;
 * String password;
 * String email;
 * 빌더 패턴에 맞춰서 객체가 생성될 수 있도록
 * 이메일에 @이가 없다면 이메일 형식이 아닙니다. 출력(초기값 null유지)
 * 최종적으로 객체가 생성될 떄 username와 password필드가 없다면
 * username 필드 또는 password필드가 비었습니다. 를 출력
 * 그리고 toString 오버라이드 해서 객체의 필드가 모두 출력되도록 커스텀
 * */
public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .userId(9842)
                .username("찬익")
                .password("4")
                .email("bae9842@naver.comf")
                .build();
        System.out.println(user);
    }
}
