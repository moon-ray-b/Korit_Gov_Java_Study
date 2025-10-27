package _19_Interface.RemoteContrlle;
/*
* 인터페이스는 기능(메소드)의 명세(규칙, 약속)만 정의하는 툴
* 객체 생성 불가능
* 사용 이유는 기능 중심 설계
* 여러 클래스에서 같은 행동을 다르게 구현할때
* 다형성을 극대화하고 싶을때
* */

public interface Press {
    void onPresses();
}
