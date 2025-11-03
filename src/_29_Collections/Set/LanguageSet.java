package _29_Collections.Set;

import java.util.*;

/*
* 1. Java, Python, C, Python, Java, Java, C++, C#, C, Java
*   이 요소들의 리스트에 넣기
* 2. 중복 제거 한 후 출력하기
* 3. 오름차순 정렬된 상태 출력하기
* 4. 특정과목 변수에 Java대입하고 맨 처음 만든 리스트에서 몇개 있는지 출력(검색)
* 5. 중복 제거 한 뒤의 set를 이용해서 중복 제거된 후의 언어 갯수 출력하기
* */
public class LanguageSet {
    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
        ));
        System.out.println("전체 언어 목록 (중복포함)");
        System.out.println(strList1);

        Set<String> languageSet = new HashSet<>(strList1);

        for(String elem: strList1){
            System.out.println(elem);
        }
        //오름 차순 정렬
        List<String> sortedList = new ArrayList<>(strList1);
        Collections.sort(sortedList);
        System.out.println("오름차순 정렬 언어 목록");
        System.out.println(sortedList);

        String search = "Java";
//        int result = 0;
//        for (String lang : strList1){
//            if (lang.equals(search)){
//                result ++;
//            }
//        }
        int frequency = Collections.frequency(strList1,search );
        System.out.println("Java의 갯수: " + frequency);

        System.out.println("언어 갯수: " + strList1.size());
    }
}
