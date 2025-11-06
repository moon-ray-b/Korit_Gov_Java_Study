package _34_Lambda.calculator;


import java.util.function.Predicate;

public class CalculatorMain {
    public static  int operate(int a, int b, Calculator c){
        return c.calculator(a, b);
    }
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 + 3 = " + add.calculator(2, 3));// 이것도 가능함
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("4 / 2 = " + operate(4, 2, div));
        // 2, 3, add 에 넣어주는곳은 어디냐 operate임

        Predicate<Integer> isZero = (num) ->{
        if (num == 0) {
            return true;
        }
        return false;
    };
        Calculator div2 = (x, y) ->{
            if (isZero.test(y)){
                System.out.println("0으로 나눌 수 없습니다");
                return 0;
            }
            return  x/y;
        };
        System.out.println("4/0 = " + operate(4, 0, div2));
    }

}
