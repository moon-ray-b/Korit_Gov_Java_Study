package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
//        String[][] seats = new String[][]
//                {
//                        {"A1", "A2","A3","A4","A5"},
//                        {"B1", "B2","B3","B4","B5"},
//                        {"C1", "C2","C3","C4","C5"}
//                };
//        for (int i = 0; i < 3; i++) { // 행
//            for (int j = 0; j < 5 ; j++) { //열
//                System.out.print(seats[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < seats.length ; i++) {
//            for (int j = 0; j < seats[i].length; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//        }

//        String[][] seats2 = {
//                {"A1", "A2","A3"},
//                {"B1", "B2","B3","B4"},
//                {"C1", "C2","C3","C4","C5"}
//        };
//
//        for (int i = 0; i < seats2.length; i++) {
//            for (int j = 0; j < seats2[i].length; j++) {
//                System.out.print(seats2[i][j] + " ");
//            }
//            System.out.println();
//        }

        //아이맥스 영화관
        //세로 10칸 가로 15칸
//        String[][] seats3 = new String[10][15];
//        //String[] eng = {"A", "B", "C", "D", "F", "G", "H", "I", "J"};
//
//        for (int i = 0; i < seats3.length ; i++) {
//            String enge = String.valueOf((char) ('A' + i));
//            for (int j = 0; j < seats3[i].length; j++) {
//                seats3[i][j] = enge + (j + 1);
//            }
//        }
//        seats3[3][7] = "__";
//        seats3[5][3] = "__";
//        seats3[7][5] = "__";
//        seats3[7][6] = "__";
//
//        for (int i = 0; i < seats3.length; i++) {
//            for (int j = 0; j < seats3[i].length; j++) {
//                System.out.print(seats3[i][j] + " ");
//            }
//            System.out.println();
//        }
        // 다차원 배열 합 구하기
        // 3x3 크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기

//        int[][] arr = new int [3][3];
//        int num = 1;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = num;
//                num += 2;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));//다차원 배열 같은 경우는 deepto를 사용해야함
//        int sum =0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println("총합 : " + sum);
//        //강사님 답안지 1)
//
//        int[][] arr1 = new int [3][3];
//        int num1 = 1;
//        int sum1 = 0;
//        for (int i = 0; i < arr1.length ; i++) {
//            for (int j = 0; j <arr1[i].length ; j++) {
//                arr1[i][j] = num1;
//                num1 += 2;
//                System.out.print(arr[i][j] + " ");
//                sum1 += arr1 [i][j];
//            }
//            System.out.println();
//        }
//        System.out.println("총합 : " + sum1);
        //강사님 답안지 2)

        //내가푼 문제
//        int sum = 0;
//        String[][] seats4 = new String[3][3];
//        for (int i = 0; i < seats4.length; i++) {
//            String eng = String.valueOf((char) ('1' + i));
//            for (int j = 0; j < seats4[i].length; j++) {
//                seats4[i][j] = eng + (j + 1);
//            }
//        }
//        for (int i = 0; i < seats4.length; i++) {
//            for (int j = 0; j < seats4[i].length; j++) {
//                System.out.print(seats4[i][j] + " ");
//
//            }
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i);
//                sum += i;
//            }
//        }
//        System.out.println("홀수의 합: " + sum);
//        System.out.println();


        //각 행 합, 각 열 합, 전체 합
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        int n = a. length;
//        int m = a[0].length;
//        int [] rowSum = new int[n];
//        int[] colSum = new int[m];
//        int total = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                rowSum[i] += a[i][j]; // [6, 15]
//                colSum[j] += a[i][j]; // [5, 7, 9]
//                total += a[i][j];
//
//            }
//        }
//        System.out.println("row :" + Arrays.toString(rowSum) );
//        System.out.println("row :" + Arrays.toString(colSum) );
//        System.out.println("row :" + total );
//
//
//        //A+B, A-B 값 구하기
//        int[][] A = {{1, 2},{3, 4}};
//        int[][] B = {{5, 6},{7, 8}};
//        int n1 = A.length;
//        int m1 = A[0].length;
//
//        int[][] add = new int[n1][m1];
//        int[][] sub = new int[n1][m1];
//
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < m1; j++) {
//                add[i][j] = A[i][j] + B[i][j];
//                sub[i][j] = A[i][j] - B[i][j];
//            }
//        }
//        System.out.println("A+B = " + Arrays.deepToString(add));
//        System.out.println("A+B = " + Arrays.deepToString(sub));

    }
}
