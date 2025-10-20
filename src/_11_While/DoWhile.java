package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 - Do While
        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관 없이 무조건 최초 1화는 실행
        // while은 조건 검사 후 실행
        /*
        * do{
        *   반복할 코드 -- 최초 한번은 실행
        * }while (조건);
        * */

//        int i = 1;
//        do{
//            System.out.println(i);
//            i++; // 조건이 부합 되지 않음에도 일단 1회는 무조건 실행함
//        }while (i <=5);

        Scanner scanner = new Scanner((System.in));
//        int choice;
//
//        do{
//            System.out.println("====메뉴====");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("0. 종료");
//            System.out.println("선택: ");
//            choice = scanner.nextInt();
//
//            switch (choice){
//                case 1:
//                    System.out.println("주문을 합니다.");
//                    break;
//                case 2:
//                    System.out.println("취소를 합니다.");
//                    break;
//                case 0:
//                    System.out.println("종료를 합니다.");
//                    break;
//                default:
//                    System.out.println("올바른 번호를 입력하세요.");
//            }
//        }while(choice !=0);

        //1부터 n까지 합 (do-while)
//        //n은 입력을 받아라(scanner)
//        System.out.print("n:  ");
//        int i = 1;
//        int n;
//        int sum =0;
//        n = scanner.nextInt();
//
//        do {
//            sum += i;
//            i++;
//            System.out.println(sum);
//        }while (i<=n);
//        System.out.println("1~" +n+"까지의 총합: " + sum);

        //숫자 맞추기
        //숫자를 입력 받아서 정답을 맞추기
        //업 다운 출력
        //시도한 횟수를 나중에 정답 마췄을때 같이 출력
        int answer = (int) (Math.random() * 100) + 1;
        int tries =0;
        int guess;
        do{
            System.out.println("숫자(1~100):");
            guess = scanner.nextInt();
            tries ++;
            if(guess < answer){
                System.out.println("up");
            } else if (guess > answer) {
                System.out.println("down");
            }

        }while(guess != answer);
        System.out.println("맞췄습니다.");
        System.out.println("시도 횟수 " + tries);
    }
}
