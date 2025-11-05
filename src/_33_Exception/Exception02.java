package _33_Exception;

class LoginFailedExceoption extends Exception{
    public LoginFailedExceoption(String message){
        super((message));
    }
}

public class Exception02 {
   public static void login(String id, String password)throws LoginFailedExceoption{
       String correctId = "admin";
       String correctPassword = "1q2w3e4r";

       if (!id.equals(correctId) || !password.equals(correctPassword)){
           throw new LoginFailedExceoption("ID 또는 PW가 틀렸습니다");
       }
   }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";
        try {
            login(inputId, inputPassword);
        }catch (LoginFailedExceoption e){
            System.out.println("로그인 실패: " + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
