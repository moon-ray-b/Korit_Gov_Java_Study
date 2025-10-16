package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str1.equalsIgnoreCase("java"));//대소문자를 구분하지 않고 내용적으로 맞나?

        str1 = "1234";
        str2 = "1234";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str1 = new String("1234");
        str2 = new String("1234");
        System.out.println(str1 == str2);// 메모리 위치 확인때문에 false / 참조위치 비교
        System.out.println(str1.equals(str2));// 세부 내용의 같은지 확인함


    }
}
