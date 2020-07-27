package Prob;

// #6. 3 과 5 의 배수를 모두 출력하는 프로그램을 작성하시오.
// 중복 허용하지 않으며 범위는 1 ~ 100으로 잡는다.

public class JQ6 {
    public static void main(String[] args) {

        final int START = 1;
        final int MAX = 100;

        for(int i = START; i <= MAX; i++)
            if(i % 3 == 0 || i % 5 == 0) System.out.println(i);
    }
}
