package _19_Interface.RemoteContrlle;

public class ChannelDownButton extends Button{
    //onpressed 필수 구현
    @Override
    public void onPresses() {
        System.out.println("채널을 한 칸 내립니다");
    }

    // 필요에 의해서 일반 메소드를 재정의
    @Override
    public void ondown() {
        System.out.println("채널을 계속 내립니다");
    }
}
