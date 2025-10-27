package _19_Interface.RemoteContrlle;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton(){
        System.out.print("Tv의 ");
        powerButton.onPresses();
    }

    public void onPressesChannelDownButton(){
        System.out.print("Tv의 ");
        channelDownButton.onPresses();
    }
    public void onPressedChannelDownButton(){
        System.out.print("Tv의 ");
        channelDownButton.onPresses();
    }
    public void onPressedChannelUpButton(){
        System.out.print("Tv의 ");
        channelUpButton.onPresses();
    }
    public void onChannelUpButton(){
        System.out.print("Tv의 ");
        channelUpButton.onup();
    }
    public void onPressedVolumeUpButton(){
        System.out.print("Tv의 ");
        volumeUpButton.onPresses();
    }
    public void onUpVolumeButton(){
        System.out.print("Tv의 ");
        volumeUpButton.onup();
    }
    public void onPressedVolumeDownButton(){
        System.out.print("Tv의 ");
        volumeDownButton.onPresses();
    }
    public void onDownVolumeDownButton(){
        System.out.print("Tv의 ");
        volumeDownButton.ondown();
    }
}
