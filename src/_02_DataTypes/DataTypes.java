package _02_DataTypes;

/*
* 표기법
*
* 카멜 표기법 ( 단봉낙타 표기법) - 변수명, 메소드명
* EX) firstName
*
* 파스칼 표기법 ( 쌍봉낙타 표기법) - 클래스명, 파일명
* EX) FirstName
*
* */

public class DataTypes {
    public static void main(String[] args) {
        // 정수
        // int - 4byte (-2147483648 ~ 2147483647)
        // long - 8byte (-9223372036854775808 ~ 9223372036854775807)

        // 문자형
        // char - 2byte

        // 실수형
        // float - 4byte
        // double - 8byte

        // 논리형
        // boolean - 1byte (true, false)

        System.out.println("안녕하세요"); // 문자열 = >  쌍따옴표로 감싸야 함
        System.out.println(123); // 정수
        System.out.println("123"); // 문자열
        System.out.println(3.14); // 실수


        /*
        * 변수 - 값을 담는 바구니
        * 데이터라는 바꿀수도 있고 하나한 수정하기엔 비효율적
        * 재사용성 향상, 유지보수 향상
        *
        * 앞에는 자료형이 - 변수명 = 데이터;
        * 자료형은 데이터의 형태
        * */

        //정수 - int, long
        int num1 = 10; //10이라는 값을 가진 int 자료형의 변수
        System.out.println(num1);
        int age = 27;
        System.out.println(age);

        long num2 = 10000000000L;// long은 기본적으로 int로 데이터 인식이 되기 때문에 뒤에 L 표기를 해야함
        num2 = 23400_00L; // 재 할당을 사용 할때
        System.out.println(num2);

        //실수 - double, float
        double d = 3.1415926234;
        System.out.println(d);

        float f = 3.1415926234F; // float는 기본적인 double의 데이터의 인식을 할려면 F 로 표기 해야함
        System.out.println(f);

        //문자, 문자열 - char, string
        char lastName = '배';
        System.out.println(lastName);
        String firstName = "찬익";
        System.out.println(firstName);

        char char1 = '가';
        char char2 = '나';
        char char3 = '다';
        System.out.println(char1 + char2 + char3);
        System.out.println("" + char1 + char2 + char3);

        String hello = "안녕하세여";
        String name = "배찬익";
        System.out.println(hello + name);

        //논리형 - boolean
        boolean isEmpty = true;// true아니면 false만 표기
        System.out.println(isEmpty);

        //이름 변수와 나이 변수, 주소 변수를 선언
        /*
        * 제 이름은 *** 이고, 나이는  **살이며, ***에서 살고 있습니다.
        * */

        String name1 = "배찬익";
        int num4 = 23;
        String home = "대연동";
        System.out.println("제 이름은 " + name1 + "이고, 나이는 " + num4 + "살이며, " + home + "에서 살고 있습니다");

    }
}
