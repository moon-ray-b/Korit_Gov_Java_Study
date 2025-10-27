package _19_Interface.RemoteContrlle;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),new ChannelUpButton(),
                new ChannelDownButton(),new VolumeUpButton(),
                new VolumeDownButton());
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onPressedPowerButton();
        PowerButton powerButton = new PowerButton();
        powerButton.onPresses();
    }

}
