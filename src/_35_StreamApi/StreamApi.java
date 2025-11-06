package _35_StreamApi;

import java.util.Arrays;
import java.util.List;

/*
* 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
* 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행
*
* 간결성
* 메소드 체이닝으로 인한 가독성 향상 및 간결해짐
* 함수형 프로그래밍
* */
public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김일", "김이", "김삼"," 김사"," 최오"," 최육"," 박칠");

        //filter() => 말 그대로 어떠한 조건을통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        System.out.println("namesWithKim: " + namesWithKim);

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);
        //Map() => 내부 요소들이게 각각 메소드를 적용하는 형태
        String multiNumbers = numbers.stream()
                .map(number -> number *2)
                .toString();
        System.out.println("multiNumbers: " + multiNumbers);

        System.out.println("---------------------------------------------");

        List<String> englishNames = Arrays.asList("alice", "anya", "smith", "pascal", "bacon", "perry");

        //a로 시작하는 애들로 거르고 모두 다 대문자로 변경
        List<String> result =englishNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase) // name -> name.toUpperCase() 같은 표현
                //:: 메소드 레퍼런스
                //:: 이것은 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
                .sorted()
                .toList();
        System.out.println("result: " + result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        //englishName에서 이름이 5글자 초과 되는 이름의 갯수
        //일반적으로 for을 이요한 결과
        //스트림을 이용한 결과 출력
        int count = 0; // 변수 count 기입 이름의 갯수를 출력하기 위해서 만든 변수
        for (int i =0; i<englishNames.size(); i++) {//향상된 for문으로 이름과 영어이름 기입을해 name이 5글자이상의 이름 갯수 출력
            if (englishNames.get(i).length() > 5) {
                count++;
            }
        }
        System.out.println("for문 결과: " + count + "개");

        long count1 = englishNames.stream().filter(name -> name.length()> 5).count();
        System.out.println(count1);
    }
}
