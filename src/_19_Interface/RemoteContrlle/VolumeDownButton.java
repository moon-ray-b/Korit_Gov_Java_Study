package _19_Interface.RemoteContrlle;

public class VolumeDownButton extends Button{
    @Override
    public void onPresses() {
        System.out.println("볼륨을 한 칸 내립니다");
    }

    @Override
    public void ondown() {
        System.out.println("볼륨을 계속 내림니다.");
    }
}
