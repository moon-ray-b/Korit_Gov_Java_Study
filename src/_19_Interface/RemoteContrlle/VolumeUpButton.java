package _19_Interface.RemoteContrlle;

public class VolumeUpButton extends  Button{
    @Override
    public void onPresses() {
        System.out.println("볼륨을 한 칸 올립니다.");
    }

    @Override
    public void onup() {
        System.out.println("볼륨을 계속 올립니다.");
    }
}
