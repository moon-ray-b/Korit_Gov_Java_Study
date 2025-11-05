package _33_Exception;
/*
* AgeRestrictionException
* => 나이제한에 대한 예외 클래스
* */
class AgeRestrictionException extends Exception{
    public AgeRestrictionException(String message){
        super(message);
    }
}
public class SignupException {
    public static void signup(String name, int age)throws AgeRestrictionException{
        if (age < 14) {
            throw new AgeRestrictionException("만 13세 미만은 가입할 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        String name = "chanik";
        int age = 11;
        try {
            signup(name, age);
        }catch (AgeRestrictionException e){
            System.out.println("회원가입 실패: " + e.getMessage());
        }finally {
            System.out.println("회원가입 처리 종료");
        }
    }
    /*
    * signup메소드(String username, int age)
    * => 가입조건 만 14세 이상
    * 이 조건에 만족하지 않으면 AgeRestrictionException 발생
    * 해당 예외는 호출한 곳에서 처리
    * 만약에 예외가 발생하지 않는다면 "Username님, 가입을 환영합니다. "출력
    *
    * main 에서 예외처리를 해주면 됩니다
    * 예외 발생시 "회원 가입 실패: 이유 ~~" 출력
    * 예외 유무 상관없이 "회원가입처리 종료" 출력
    * */
}
