package _18_Abstraction;
/*
* Abstract는 "추상적인","형태만 있는"이라는 뜻
* Java에서 Abstract는 "틀은 있지만 내용은 없는" 클래스나 메소드를 만들 때 사용한다.
* 이 기능은 꼭 있어야 해!! 라고 미리 틀을 잡아 놓는것 하지만 어떻게 구현할지는 나중에(자식 클래스) 정한다
*
* 추상클래스
* 객체를 생성할 수 없고, 공통적인 기능의 틀만 가지고 있는 클래스
*
* 추상클래스를 왜 써야 함??
* 설계 일관성과 확장성을 확보하기 위해서 => 공통된 구조를 가진 자식 클래스들을 설계할 수 있게 된다.
* 오류 방지 / 강제 구현 => 추상 메소드를 구현하지 않으면 컴파일 에러 발생(필수 기능 구현을 누락 방지)
* */
public abstract class Factory {
    //필드 선언
    private String factoryName;

    //추상 메소드 정의
    public abstract void produce(String model);
    public abstract void manage();

    /*
    * abstract가 메소드의 점근 지정자와 리턴 타입 사이에 명시가 되면,
    * 클래스도 동일하기 abstract가 있어야 한다
    * 추상클래스여야 추상메도스를 선언할 수 있다.
    * 추상메소드가 하나라도 있으면 추상클래스다.
    * */

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void displayInfo(){
        System.out.println("공장 정보를 출력합니다.\n공장 이름: "+  factoryName);
    }
}
