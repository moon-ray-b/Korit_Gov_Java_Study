package _20_Casting.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

        //업캐스팅( 자식 - > 부모)
        Animal a = new Dog();
        //a는 Animal타입이자만 내부적으로 Dog의 객체

        a.speak();
//        a.wagTail();// 안되는 이유는 부모에는 테일이 없기 때문이다 자식만 가지고 있는 메소드는 호출 할수 없다

        //다운 캐스팅(부모 -> 자식)
        ((Dog) a).wagTail();

        Animal a2 =dog1;
        Dog dog2 = (Dog) a2;
        dog2.wagTail();

        //다양한 자식들을 하나의 클래스타입으로 처리 할 수 있다.
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog[] dogs = {
                dog3,
                dog4,
                dog5
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        Animal[]animals = {
                dog, cat, tiger
        };

        for (Animal animal : animals){
            animal.speak();
        }
    }
}
