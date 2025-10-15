package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting

        //정수에서 실수로 바꾸는법
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);

        System.out.println((double) scoreInt);
        float scoreFloat1 = (float) scoreInt;
        System.out.println(scoreFloat1);//재 할당이 불가능함 그래서 새롭게 항상량을 만들어사 출력하기.

        //실수에서 정수로 바꾸는법
        float scoreFloat = 97.3F;
        System.out.println((int)scoreFloat);

        double scoreDouble = 88.4;
        System.out.println((int) scoreDouble);

        //double sum1 = 98+77.3;
        double sum1 = (double) 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 77.3;
        System.out.println(sum2);

        float sum3 =98 + 77.3F;
        System.out.println(sum3);

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        //int -> long ->float -> double (자동 형 변환)
        //int를 중심으로 자동 형 변환이 가능함.

        int convertedScoreInt = (int)scoreDouble;
        System.out.println(scoreDouble);
        // double -> float -> long -> int (수동 형 변환)

        long scoreLong = 87L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(scoreLong);

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        //숫자를 문자열로 변환
        int num1 =55;
        String strNum1 = String.valueOf(num1);// 첫번째 방법
        System.out.println(strNum1);

        strNum1 = Integer.toString(num1); //두번째 방법
        System.out.println(strNum1);

        double num2 = 55.55;
        String strNum2 = String.valueOf(num2);//소수점 문자열로 변환 첫번째 방법
        strNum2 = Double.toString(num2);//소수점 문자열로 변화 두번째 방법
        System.out.println(strNum2);

        float num3 = 56.34F;
        String strNum3 = String.valueOf(num3);
        strNum3 = Float.toString(num3);
        System.out.println(strNum3);

        //문자열에서 숫자로 변환
        int i = Integer.parseInt("34");
        double d = Double.parseDouble("34.44");
        float f = Float.parseFloat("34.1234F");

        //i = Interger.parseInt("숫자");

        float floatNumber = 3.141592F;
        //정수만 출력하기
        System.out.println((int) floatNumber);



    }
}
