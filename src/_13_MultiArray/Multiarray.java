package _13_MultiArray;

public class Multiarray {
    public static void main(String[] args) {
        //다차원 배열 (2차원)
        //영화관 좌석
        // A1~A5 좌석
        // B1~B5 좌석
        // c1~c5 좌석
        String[] seatA = {"A1", "A2","A3","A4","A5"};
        String[] seatB = {"B1", "B2","B3","B4","B5"};
        String[] seatC = {"C1", "C2","C3","C4","C5"};

        //2차원 배열 선언 => 3 * 5

//        String[][] seats = new String[3][5]; //방법 2개다
        String[][] seats = new String[][]
                {
                        {"A1", "A2","A3","A4","A5"},//0번쨰 인덱스 부터 시작, 가로 행 세로 열
                        {"B1", "B2","B3","B4","B5"},
                        {"C1", "C2","C3","C4","C5"}
                };
        //B3에 접근
        System.out.println(seats[1][2]);

        //C4에 접근
        System.out.println(seats[2][3]);

        //첫줄에 3칸, 두번째 줄 4칸, 세번쨰 줄, 5칸
        String[][] seats2 = {
                {"A1", "A2","A3"},
                {"B1", "B2","B3","B4"},
                 {"C1", "C2","C3","C4","C5"}
        };
        //A5점근
//        System.out.println(seats2[0][4]);// 오류발생
        String[][][] multiArray = new String[][][]{
            {{}, {}, {}},
            {{}, {}, {}},
            {{}, {}, {}}
        };

    }
}
