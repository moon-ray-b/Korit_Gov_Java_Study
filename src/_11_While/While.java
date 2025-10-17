package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //반목문 - while
        //조건이 참일 경우 계속 반복
        //for과 차이
        //for문 횟수 중심, while문 조건 중심
        /*
        * while (조건){
        *  반복할 코드
        * }
        * */

        //1~5까지 출력 하겠다
//        int i= 1;
//        while (i <= 5){
//            System.out.println(i);
//            i++; //조건을 변경하기 위한 코드 필요함
//        }
//
//        i = 10;
//        while (i >= 1){
//            System.out.println(i);
//            i--;
//        }

        //짝수만 출력하겠다 (1~10)
//        int i= 1;
//        while (i<=10){
//            if(i % 2 ==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//
//        boolean flag = true;
//        Scanner scanner = new Scanner(System.in);
        //점수를 입력한다 (0~100)
//        while (flag){
//            int score = scanner.nextInt();
//            if(0 <= score && score <= 100){
//                System.out.println("점수는: " + score);
//                flag = false; //break 해도 됨
//            } else {
//                System.out.println("다시 입려하세요.");
//            }
//        }

//        int menu;
//        while (true){
//            System.out.println("메뉴를 선택하세요.");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("3. 재주문하기");
//            System.out.print("메뉴를 고르세요 >>>");
//            menu = scanner.nextInt();
//
//            switch (menu){
//                case 1:
//                    System.out.println("주문하기 메뉴");
//                    break;
//                case 2:
//                    System.out.println("취소하기 실행");
//                    break;
//                case 3:
//                    System.out.println("재 주문하기 메뉴");
//                    break;
//                default:
//                    System.out.println("다시 입력해주세요.");
//                continue;
//            }
//            break;
//        }

        //문제 => 1부터 100까지 누적합
        int sum = 1;
        while(sum <= 100){
            sum += sum;
            System.out.println(sum);
        }

        //문제 => 1번 부터 100번까지 시강 웨이팅
        //이때 1번부터 차례대로 입장 => **번 손님 입장! 출력
        //10번 손님이 입장할때 한정메뉴가 솔드아웃
        //솔드아웃 되었기 때문에 가게 문닫음
        //마지막엔 영업종료 출력

        //1번부터 50번까지 웨이팅
        //메뉴가 20개까지만 한정판매 => 솔드아웃 가게 샸다 내림 출력
        // 이때 14번이 노쇼 => *번 노쇼 발생! 출력
        //이것을 while

    }
}
