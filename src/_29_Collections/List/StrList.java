package _29_Collections.List;

import _10_For.For;

import java.util.*;

public class StrList {
    //collection
    //여러 객체를 모아놓는 것

    //List - 순서가 있는 데이터의 집합, 중복된 요소를 허락한다.
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>();

//        //요소 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A");//중복 허용
        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

//        String[] strArray = new String[2];
//        strArray[0] = "배찬익";
//        strArray[1] = "이찬익";
//        System.out.println(strArray[0]);

            System.out.println(strList2.get(3));
            System.out.println(strList2);

        //특정 요소의 포함 여부 -> contains()
        String  serarchElam1 = "python";
        boolean containResult1 = strList2.contains(serarchElam1);
        System.out.println(serarchElam1 + "의 포함 여부 : " + containResult1);

        String searchElem2 = "py";
        boolean containResult2 = strList2.contains(searchElem2);
        System.out.println(serarchElam1 + "의 포함 여부 : " + containResult2);

        String email = "example@naver.com";
        boolean containResult3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + containResult3);

        //요소 삭제
        String removeElem1 = "kotlin";
        boolean removerResult1 = strList2.remove(removeElem1);
        System.out.println(removerResult1 + "의 삭제 여부 :" + removerResult1);

        //오름차순 정렬
        Collections.sort(strList2);
        System.out.println(strList2);

        //내림차순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println(strList2);

        //List의 길이 구하기
        System.out.println(strList2.size());

        //Python 언어, javascript 언어...
        //일반 for문을 이용해서 뒤에 다 언어 붙여서 출력
        //foreach
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println( strList2.get(i) + "언어");
        }
        for (String lang : strList2){
            System.out.println(lang + "언어");
        }
    }
}
