package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is ChanIk Bae";
        System.out.println(s.length());//문자열의 길이

        System.out.println(s.toUpperCase());//모든 문자를 대문자 변환
        System.out.println(s.toLowerCase());//모든 문자를 소문자 변환

        System.out.println(s.contains("name"));//문자열에 포함 여부를 결과 값으로 나타냄
        System.out.println(s.contains("age"));
        System.out.println(s.indexOf("name"));//name이라는 단어의 위치를 알려줌 MY부터 0을 부터의 시점을 나타넴 공백 포함
        System.out.println(s.indexOf("age"));//해당 문자에 없으면 -1이 나옴

        s = "I like music and movie and travel";
        System.out.println(s.lastIndexOf("and"));// 여러개 중 마지막 문자를 확인함
        System.out.println(s.lastIndexOf("name"));//이것도 동일하게 없는 문자이면 -1을 나타냄
        System.out.println(s.startsWith("I like"));//해당 문자열에 시작의 여부 확인 (true, false)
        System.out.println(s.startsWith("My name"));//아니면 false
        System.out.println(s.endsWith("travel"));// 해당 문자열로 끝남의 확인 여부 (true, false)
    }
}
