package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        //속성값이 아무것도 없는 객체 직접 주입 해야함
        Car audi = new Car();//NoArgs사용
        audi.carName = "A7";
        //System.out.println(audi.carName);
        //속성값 중 narName만 주입된 객체
        Car santage = new Car("싼타페");
        System.out.println(santage.carName);
        //속성값 모두 주입된 객체
        Car bmw = new Car("bmw", 2025, "black");
        bmw.showInfo();

    }
}
