package Prob;

// #7. 두 개의 숫자를 입력 받도록 한다.
// 입력받아 두 숫자의 배수를 모두 더한다.
// 범위는 1 ~ 20 까지의 범위로 한정한다.

import java.util.Scanner;

public class JQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int START = 1;

        int n, m, k, sum = 0;
        System.out.print("1 ~ 20 사이의 두 개의 숫자와 구하려는 배수를 입력하시오: ");

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        if((n > 0 && n < 21) && (m > 0 && m < 21)) {
            for (int i = START; i <= n; i++)
                if (i % k == 0) sum += i;

            for (int i = START; i <= m; i++)
                if (i % k == 0) sum += i;
        }
        else System.out.println("범위를 벗어났습니다.");
        System.out.println("배수의 합은: " + sum);
    }
}
