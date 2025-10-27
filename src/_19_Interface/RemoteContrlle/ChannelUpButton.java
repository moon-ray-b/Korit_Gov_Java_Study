package _19_Interface.RemoteContrlle;

public class ChannelUpButton extends Button{
    @Override
    public void onPresses() {
        System.out.println("채널을 한 칸 올립니다");
    }

    @Override
    public void onup() {
        System.out.println("채널을 올립니다");
    }
}
