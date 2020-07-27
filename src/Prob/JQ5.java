package Prob;

// #5. 1 ~10의 범위에서 3의 배수는 더한다.
// 3으로 나눠 나머지가 1인 숫자는 곱한다.
// 3으로 나눠 나머지가 2인 숫자는 뺀다.
// 각각을 연산하면 모두 더한 값을 계산하시오.

public class JQ5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 0;
        int mul = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0) {
                a += i;
            }
            else if(i % 3 == 1) {
                b = b * i;
            }
            else if(i % 3 == 2 && i > 4) {
                c = c - i;
            }

            d = a + b + c;



        }
        System.out.printf("합: %d", d);
    }
}
