package _16_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount( 12345);
        bankAccount.deposit(5);
        bankAccount.withdraw(5);
    }
}
//문제
//WaterBottle 패키지 만들고
//WaterBottle클래스
//currentWater 물의 양 => 속성
//메소드 물 채우기 fill => chleodydfid 1000으로 이상으로 채울 수 없음
//메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
//getter로 현재 물의 양 출력하기
//객체 생성시 빈병