package _28_Wildcard;

/*
* <? super U>=> 하한 경계 와일드카드
* 하위 클래스 제한 (U와 그 부모클래슽들만 가능)
* 하한 U
* 쓰기는 가능하나 읽기가 안전하지 않다
* */
public class LowerBounded {
    public static void putDog(Box<? super Dog>box){
//        box.setValue(new Dog());
//        box.setValue(new Corgi());
        Object d = box.getValue(); //Object가 아닌 Dog로 했을시 컴파일 에러가 뜬다 (Box<object>, Box<Animal>일수도)
        System.out.println(d);
    }
}
