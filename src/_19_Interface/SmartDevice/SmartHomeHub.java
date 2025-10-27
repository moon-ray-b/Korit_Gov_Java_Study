package _19_Interface.SmartDevice;
/*
* 필드에 각 가전이 들어 있음
* 고유 메소드로 turnONAll() => 모든 가전을 전원 킴
* turnOffAll() => 모든 가전의 전원을 끔
* showStatus() => 모든 가전의 상태 출력
* */
public class SmartHomeHub{
    private SmartAirConditioner smartAirConditioner;
    private SmartLight smartLight;
    private SmartSpeaker smartSpeaker;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }
    public void setSmartAirConditionerGetName(){
        System.out.println(smartAirConditioner.getName());
    }
    public void setSmartAirConditionerTurnOn(){
        smartAirConditioner.turnOn();
    }
    public void setSmartAirConditionerTurnOff(){
        smartAirConditioner.turnOff();
    }
    public void setSmartAirConditionerIsTurnOn(){
        smartAirConditioner.isTurnedOn();
    }
    public void setSmartAirConditionerA(){
        smartAirConditioner.a();
    }
    public void setSmartAirConditionerB(){
        smartAirConditioner.b();
    }

    public void setSmartLightGetName(){
        System.out.println(smartLight.getName());
    }
    public void setSmartLightTurnOn(){
        smartLight.turnOn();
    }
    public void setSmartLightTurnOff(){
        smartLight.turnOff();
    }
    public void setSmartLightIsTurnOn(){
        smartLight.isTurnedOn();
    }
    public void setSmartLightA(){
        smartLight.a();
    }
    public void setSmartLightB(){
        smartLight.b();
    }

    public void setSmartSpeakerGetName(){
        System.out.println(smartSpeaker.getName());
    }
    public void setSmartSpeakerTurnOn(){
        smartSpeaker.turnOn();
    }
    public void setSmartSpeakerTurnOff(){
        smartSpeaker.turnOff();
    }
    public void setSmartSpeakerIsTurnOn(){
        smartSpeaker.isTurnedOn();
    }
    public void setSmartSpeakerC(){
        smartSpeaker.c();
    }
    public void turnOnAll(){
        smartSpeaker.turnOn();
        smartLight.turnOn();
        smartAirConditioner.turnOn();
    }
    public void turnOffAll(){
        smartSpeaker.turnOff();
        smartLight.turnOff();
        smartAirConditioner.turnOff();
    }
    public void showStatus(){
        System.out.println(smartSpeaker.isTurnedOn());
        System.out.println(smartLight.isTurnedOn());
        System.out.println(smartAirConditioner.isTurnedOn());
    }
}

