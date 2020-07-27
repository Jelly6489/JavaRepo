package Prob;

// #8. 1 ~ 50 중에 3의 배수를 찾아 모든 값을 더한 결과를 출력하시오.

public class JQ8 {
    public static void main(String[] args) {

        final int START = 1;
        final int MAX = 50;

        int sum = 0;

        for(int i = START; i <= MAX; i++)
            if(i % 3 == 0) sum += i;
        System.out.println(sum);
    }
}
