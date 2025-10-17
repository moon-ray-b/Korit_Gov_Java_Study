package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Switch
        //break를 만날때까지 계속 실행

        //ranking =>1등 - 전액 장학금
        //2등 - 반액 장학금 출력
        //3등 - 소정의 상금
        //4등 - 박수쳐줌

        int ranking = 2;
//
//        if(ranking == 1){
//            System.out.println("전액 장학금");
//        }else if(ranking ==2){
//            System.out.println("반액 장학금");
//        }else if(ranking ==3){
//            System.out.println("소정의 상금");
//        }else {
//            System.out.println("박수 쳐줌");
//        }

        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // 만약 case 출력이 같을경우는 2에서 멈추지 않고바로 3으로가서 출력후 break가 걸린다
                    //case 출력과 break는 지워도 됨 case3하고 같으니깐.
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("소정의 상금");
                break;
            default: //모든 case를 만족하지 않을때
                System.out.println("박수 쳐줌");
        }

        int grade = 1;
        int price = 7000;
        //1등급은 10000, 등급이 낮아질수록 - 10000
        // 1 - 10000
        // 2 - 9000
        // 3 - 8000

        switch (grade){
            case 1:
                price += 1000;

            case 2:
                price += 1000;

            case 3:
                price += 1000;
                break;
        }
        System.out.println(price);

        //월을 입력받고(int)
        //3, 4, 5 => Spring 출력
        //6, 7, 8 => Summer 출력
        //9, 10, 11 => Autumn 출력
        //12, 1, 2 => Winter 출력

        Scanner scanner = new Scanner(System.in);
//        int daye = scanner.nextInt();
//        switch(daye){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            default:
//                System.out.println("유호하지 않는 월 입니다.");
//        }

        //숫자 a를 입력받고
        //연산다 기호를 입력받고 (+,-,*,/) => 유호한 기호가 아닙니다.
        //숫자 b를 입력받는다.
        //switch case문을 이용해서 연산결과를 출력하시오


        int a =  scanner.nextInt();
        scanner.nextLine();
        String c = scanner.nextLine();
        int b = scanner.nextInt();


        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("유호한 기호가 아닙니다.");
        }

    }
}
