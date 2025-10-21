package _14_Method;

public class Return {
    public static String getName(){
        String name = "찬익";
        return name;
    }

    public static int getAge(){
        int age = 23;
        return age;
    }
    public static void main(String[] args) {
        //반환값
        //void는 반환 값이 없다라는 의미를 가지고 있음
        String name = getName();
        System.out.println(name);

        int myAge = getAge();
        System.out.println(myAge);
    }
}
