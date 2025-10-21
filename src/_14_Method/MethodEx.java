package _14_Method;

public class MethodEx {
    public static int on(int a, int b, int c) {
        int max = 0;
        if (a > b) {
             max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public  static boolean in (int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false; // return num %2 ==0; 도 가능
    }

    public static int abs(int n){
        return  n < 0 ? -n : n;
    }

    public  static boolean contains(int[] a, int target){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //최댓값 구하기 ( 세 수를 전달)
        //ex) max(3,7,5) => 7
            System.out.println(on(3,7,5));
        //홀짝 판단
        //ex) isEven(8) => ture(짝수면 true, 홀수면 false)
            System.out.println(in(4));

        //절댓값 구하기
        //삼항연산자 이용
        System.out.println(abs(-8));

        // 포함 여부(선형탐색)
        //ex) contains([1,3, 5] , 3) => true, 없으면 false
        int[]nums={1, 3, 7, 9};
        System.out.println(contains(nums, 9));
    }
}
