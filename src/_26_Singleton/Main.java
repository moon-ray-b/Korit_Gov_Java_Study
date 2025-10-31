package _26_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManger logManger1 = LogManger.getInstance();
        LogManger logManger2 = LogManger.getInstance();
        logManger1.log("첫번쨰 로그 메시지");
        logManger2.log("두번쨰 로그 메시지");
        System.out.println(logManger1 == logManger2);
    }
}
