package _06_String;

public class String02 {
    public static void main(String[] args) {
        String s = "I like music and movie and travel";

        System.out.println(s.replace(" and", ","));//타겟을 정한뒤 원하는 값으로 변경됨(변수 2개 들어가야함)
        System.out.println(s.replace(" ",""));// 공백 제거도 가능함

        //인덱스 기준 특정 위치부터 출력
        System.out.println(s.substring(7));//자신이 원하는 부분부터 출력 가능함
        //인덱스 기준 7부터 11까지, 마지막은 본인 포함 X
        System.out.println(s.substring(7, 12));// 범위를 2개를 지정하면 원하는 부분부터 끝도 지정 가능함

        //특정 문자열 있는 위치부터 출력
        System.out.println(s.indexOf("movie"));
        System.out.println(s.substring(s.indexOf("movie")));

        s="       I want go home       ";
        //문자여르이 앞뒤 공배 제거
        System.out.println(s.trim());

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));//이어 붙여주는 출력문
        System.out.println(s1.concat("! !").concat(s2));



    }
}
