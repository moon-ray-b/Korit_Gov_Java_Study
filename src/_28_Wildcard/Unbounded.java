package _28_Wildcard;

public class Unbounded {
    //<?>는 타입에 제한이 없다 => 비한정적 와일드카드
    //읽기만 (get)만 가능하고, 쓰기는(set) 불가능하다
    //=> 타입이 명확하지 않기 때문
    public static void inspect(Box<?> box){
//        box.setValue(new Dog() );
        System.out.println("Box의 내용물: "+box.getValue());
    }
}
