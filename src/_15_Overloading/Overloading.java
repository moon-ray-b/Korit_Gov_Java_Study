package _15_Overloading;

public class Overloading {
    public static int getPower(int number){
        return number * number;
    }
    public  static int getPower(double doubleNum){
        return (int)(doubleNum * doubleNum);
    }

    public static String pull(String name){
        return name;
    }
    public static void pull(String n, int a){
        System.out.println(n+a);
    }
    public static void pull(String n, int a, String m){
        System.out.println(n + a + m);
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러개 선언
        //전달값(파라미터)의 타입이 달라야한다.
        //또는 갯수가 달라야한다.
        //대신에 반환형은 같아도 된다.
        System.out.println(getPower(3.14));

        //printInfo()
        //문자열 이름만 전달해서 => 이름 출력
        //문자열 이름과 정수 나이 전달 => 이름, 나이 출력
        //문자열 이름과 정수 나이, 문자열 이메일 전달 => 이름, 나이, 이메일 출력
        System.out.println(pull("찬익"));
        pull("찬익", 23);
        pull("찬익", 23,"bae9842" );
    }
}
