package _14_Method;

public class ParameterAndReturn {

    public static  void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은" + result + "입니다.");
    }
    // ==> 리턴을 number의 제곱결과값을 리턴하도록
    public static int power1(int number){
        int result1 = number * number;
        return  result1;
    }

//    public static  void powerByExp(int number, int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }

        public static  int powerByExp(int number, int exponent) {
            int result2 = 1;
            for (int i = 0; i < exponent; i++) {
                result2 *= number;
            }
            return result2;
        }
    public static void main(String[] args) {
        int powerResult = power1(2);
        System.out.println(powerResult);

        int powerByExpResult = powerByExp(2,4);
        System.out.println(powerByExpResult);

    }
}
