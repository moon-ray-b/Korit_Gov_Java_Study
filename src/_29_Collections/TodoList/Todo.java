package _29_Collections.TodoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 문제 TodoList
 * 1. todoList를 담을 리스트 생성
 * 2. 사용자한테 뚜두를 입력받을건데 몇개 입력할건지 count변수에 입력받기
 * 3. count만틈 반복해서 사용자에게 뚜두입력받아 리스트에 추가
 * 4. 그 다음 향상된 for문 사용해서 할 일 목록 쭉 출력
 * 5. 목록 출력 뒤 특정 뚜두를 포함여부를 확인하기 위해서 searchTodo라는 변수에
 *    찾을 뚜두 입력받기 그러고 포함여부 확인후 여부 출력
 * 6. 포함여부 확인 후 삭제할 뚜두를 입력받아 삭제하기
 * 7. 뚜두들을 오름차순 정렬 후 전체 출력
 * 8. 이번엔 뚜두들을 내림차순 정렬 후 전체 출력
 * 9. 저체 뚜두들의 갯수 출력하기
 * */
public class Todo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 TODO 개수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 할 일을 입력하세요: ");
            String todo = sc.nextLine();
            strList.add(todo);
        }
        for (String t : strList) {
            System.out.println("- " + t);
        }
        System.out.println("포함 여부를 확인할 할 일을 입력하세요: ");
        String serarchTodo = sc.nextLine();
        boolean containResult1 = strList.contains(serarchTodo);
        System.out.println(serarchTodo + "의 포함 여부: " + containResult1);

        System.out.println("삭제할 할 일을 입력하세요: ");
        String removeElem2 = sc.nextLine();
        boolean removerResult1 = strList.remove(removeElem2);
        System.out.println(removerResult1 + "의 삭제 여부 :" + removerResult1);

        Collections.sort(strList);
        System.out.println("오름차순 정렬");
        for (String todo : strList) {
            System.out.println("- " + todo);
        }

        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("내림차순 정렬");
        for (String todo : strList) {
            System.out.println("- " + todo);
        }
        System.out.println("총 할일 " +strList.size());
    }

}
