package _19_Interface.SmartDevice;
/*
* 인터페이스 상속받고 에어컨이랑 똑같이
* 근데 필드 속성으로 turnedOn이랑 brightness=50
* 고유 메소드로 밝기를 올리는거 하나 내리는 거 하나
* 올리거나 내릴때 전원이 켜져 있어야 하며 10씩 증감
* */
public class SmartLight implements SmartDevice{
    private boolean turnedOn;
    private int brightness = 50;

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + "의 전원을 끕니다. 밝기는: "+ brightness);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + "의 전원을 킵니다. 밝기는: " + brightness);
    }

    @Override
    public String getName() {
        return "스마트 라이트";
    }
    public void a(){
        if (turnedOn == true){
            brightness +=10;
            System.out.println("밝기가 높아 졌습니다.");
        }else{
            System.out.println("불이 꺼졌습니다.");
        }
    }
    public void b(){
        if(turnedOn == true){
            brightness -=10;
            System.out.println("밝기가 낮아 졌습니다");
        }else {
            System.out.println("불이 꺼졌습니다.");
        }
    }
}
