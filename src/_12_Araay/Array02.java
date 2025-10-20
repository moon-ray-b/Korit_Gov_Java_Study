package _12_Araay;

public class Array02 {
    public static void main(String[] args) {
        //배열 순회
//        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};
//
//        //반목문을(for) 이용한 순회
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(countries[i]);
//        }
//
//        //반복문(for) 순회, 근데 이제 배열의 길이를 곁들인...
//        for (int i = 0; i < countries.length ; i++) {
//            System.out.println(countries[i]);
//        }
//
//        //enhanced for (for - each) / 향상된 for문
//        for(String country : countries){
//            System.out.println(country);
//        }

        //본인이 좋아하는 음식 5가지 배열에 저장하고
        //향상된 for문을 이용해서 출력하기
        //"내가 좋아하는 1번 음식***"

        int n =1;
        String[] Food = {"치킨", "햄버거", "고기", "나물", "회"};
        for (String name : Food){
            System.out.println(n+ "번째"+ name);
            n++;
        }
    }
}
