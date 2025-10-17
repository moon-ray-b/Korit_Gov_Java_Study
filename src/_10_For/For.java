package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //반복문 - for
        /*
        * for(선언; 조건; 증감){
        *   반복할 코드
        *}
        * */

//        for(int i = 0; i<10; i++){//복습 ++은 1식 증강가
//            System.out.println("안녕" + i);
//        } // for문 단축키 fori 히면 됨
//
//        for (int i = 0; i <= 50 ; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        for (int i = 0; i <=50 ; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 10; i > 0 ; i--) {
//            System.out.println(i);
//        }

        //문제
        //1~100까지 다 더한 총합을 구하시오
//        int sum = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        //문제
        //1~100까지 중에 짝수만 더한 총합을 구하시오
//        int sum1 = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            if(i%2 == 0) {
//                sum1 += i;
//                System.out.println("sum1" + sum1);
//            }
//        }
//        System.out.println(sum1);

        //문제(한 단만)
        //특정 단을 입력받아서 1~9까지 구구단 출력하기

        Scanner scanner = new Scanner(System.in);
//        int b = scanner.nextInt();
//        for (int i = 1; i <= 9  ; i++) {
//            System.out.println(d + "X" + i + "=" + );
//            }


        //구구단 전체 출력하기

//        int b = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + "X" + j + "=" + (i*j) );
//            }
//        }
        /*
        *  *
        *  **
        *  ***
        *  ****
        *  *****
        * */

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
        //break 직전의 반복문에서 멈춤, continue 조건하는 반복문이 뛰어 넘고 처음으로 돌아감

//        for (int i = 1; i <=10 ; i++) {
//            if(i==5){
//                continue;
//            }
//            if(i==7){
//                break;
//            }
//            System.out.println(i);
//        }

        //문제
        //1~50까지 중에 3의 배수 뺴고 출력하기
        //단 3의 배수는 " " 띄어쓰기 한칸 출력으로 대체


//        for (int i = 0; i <= 50 ; i++) {
//            if(i % 3 == 0) { //3의 배수 조건
//                System.out.println(" ");
//                continue;
//            }
//            System.out.println(i);
//        }
        //1부터 계속 합께를 구하되 합계가 200이 넘어가면 스탑
        //마지막은 최종 합과 마지막으로 더한 수를 출력

//        int man = 0;
//        for (int i = 1; ; i++) {
//           man += i;
//           if (man > 200) {
//               System.out.println("마지막 더한 수: " + i);
//               System.out.println("최종 합계: " + man);
//               break;
//           }
//        }
        //1부터 100까지 수 중에서 3의 배수와 5의 배수의 갯수를 각각 출력하시오
//        int m3 = 0;
//        int m5= 0;
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 3 == 0) { //3의 배수 조건
//                m3++;
//            }
//            if (i % 5 == 0) {
//                m5++;
//            }
//        }
//            System.out.println(m3);
//            System.out.println(m5);


        //정수 5개를 입력받고 입력받은 수 중 가장 큰 값 출력
        //범위는 1에서 100사이 만약 1에서 100사이가 아니라면
        //범위를 벗어났습니다 출력 후 스탑

//        int a = 0;
//
//        for (int i = 1; i < 5 ; i++) {
//            int inputNum = scanner.nextInt();
//            if (inputNum >=100 || inputNum < 1){
//                System.out.println("범위를 벗어 났습니다.");
//                break;
//            }
//            if(a < inputNum){
//                a = inputNum;
//            }
//        }
//       System.out.println("최댓값 : " + a);

        //팩토리얼 구하기
        //숫자를 입력받아 팩토리얼 구하기
        //단 1~10까지만 입력받기

        int b = 1;
        int ing = scanner.nextInt();
        for (int i = 1; i <= ing ; i++) {
            b *= i;
        }
        System.out.println(b);


        //1~50까지 반복하는데 3 6 9 일때는 박수만 출력
        //5 일때는 으악 출력
        for (int i = 1; i <=50; i ++){
            boolean flag = true;

            if(i % 10 == 3 || i % 10 == 6 || i % 10 ==9){
                System.out.println("박수");
                flag = false;
            }else if(i%10 == 5){
                System.out.println("으악");
                flag = false;
            }if (i / 10 ==3 ){
                System.out.println("박수");
                flag = false;
            }if (i == 50){
                System.out.println("으악");
                flag = false;
            }if (flag){
                System.out.println(i);
            }
        }


    }
}