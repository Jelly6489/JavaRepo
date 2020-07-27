package Prob;

// #12. 3의 n승을 구하는 함수를 작성하시오.
// n 값을 입력 받아 입력하면 결과가 출력되게 만든다

import java.util.Scanner;

public class JQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3의 몇 제곱을 구하시겠습니까? ");

        int n = sc.nextInt();

        System.out.println(Math.pow(3, n));
    }
}
