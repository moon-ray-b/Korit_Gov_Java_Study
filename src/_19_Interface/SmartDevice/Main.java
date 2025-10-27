package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub smartHomeHub = new SmartHomeHub(new SmartAirConditioner(), new SmartLight(), new SmartSpeaker());
        smartHomeHub.turnOnAll();
        smartHomeHub.showStatus();
        smartHomeHub.turnOffAll();
    }
}
