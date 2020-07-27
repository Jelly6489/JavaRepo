package Prob;

// #9. 1 ~ 50 중에 2의 배수를 찾아서 출력하시오.

public class JQ9 {
    public static void main(String[] args) {

        final int START = 1;
        final int MAX = 50;

        for(int i = START; i <= MAX; i++)
        {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
