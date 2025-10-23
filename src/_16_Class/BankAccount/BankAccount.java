package _16_Class.BankAccount;
/*
* BankAccount 클래스에서 속성으로 balance 선언
* balance는 private로 제한
* 해당 객체를 생성할때 balance에 값 주입
* 객체가 생성 될때 "계좌가 개설되었습니다. 현재 잔액 : ****원" 출력이 되도록
* balance의 값을 볼 수 있게 get만들기
* 메소드로 deposit, withdraw 만들기
* 이때 deposit(입금) => 입금 금액이 0원 이상일때 입금이 가능하도록
* 입금이 되었을때 "계좌에 ****원이 입금되었습니다. 현재 잔액 : ***원" 출력
* withdraw(출금) => 출금액이 0원 이상이면서 잔액이 출금액보다 이상일 경우 출금 가능
* 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
* 만약에 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액: ****" 출력
* 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
* */
public class BankAccount {
    private int  balance;

    public BankAccount(int balance) {
        this.balance = balance;
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + balance + "원");
    }

    public int getBalance() {
        return balance;
    }
    public int deposit(int a) {
        if (0 < a) {
            balance = balance + a;
            System.out.println("계좌에" + a + "원이 입금되었습니다.");
            System.out.println("현재 잔액: " + balance);

        }
        return balance;
    }
    public int withdraw(int b) {
        if (0 <= b && b <= balance) {
            balance = balance - b;
            System.out.println("계좌에" + b + "원이 출금되었습니다");
            System.out.println("현재 잔액: " + balance);
        } else if (b < 0) {
            System.out.println("출금액은 0원 초과이어야 합니다");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance);
        }
        return  balance;
    }
}
