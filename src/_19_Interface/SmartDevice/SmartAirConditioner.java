package _19_Interface.SmartDevice;
/*
 * SmartAirConditioner클래스를 만들고 SmartDevice를 상속
 * 고유 속성
 * bool turnedOn
 * int temperature = 24
 * getName => 스마트 에어컨 리턴
 * turnOn =>
 * turnedOn = true;
 * "해당 가전 이름"의 전원을 킵니다. 설정 온도는: **도
 * turnOff => 반대로
 * isTurnedOn => 현재 전원 상태 리턴
 * 고유 메소드로 온도 올리는거 하나 내리는거 하나
 * 근데 전원이 꺼져있으면: 헌재 전원이 꺼져있습니다 출력
 * */
public class SmartAirConditioner implements SmartDevice {
    private boolean turnedOn;
    private int temperature = 24;

    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + "의 전원을 킵니다. 설정 온도는: " + temperature);
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + "의 전원을 끕니다. 설정 온도는: "+ temperature);
    }

    @Override
    public boolean isTurnedOn() {
        System.out.println("현제 전원이 꺼져있습니다.");
        return turnedOn;
    }
    public void a(){
        if (turnedOn == false){
            System.out.println("전원이 꺼져있습니다.");
        }else{
            temperature += 1;
        }
    }
    public void b(){
        if (turnedOn == true){
            System.out.println("전원이 켜져있습니다");
        }else{
            temperature -=1;
        }
    }

}
