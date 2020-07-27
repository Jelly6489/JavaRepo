package Prob;

// #14. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... 형태로 숫자가 진행된다.
//   1 ~ 57번째까지의 수들로 홀수들의 합을 하고 짝수들의 합을 구한다.
//   홀수들의 합 - 짝수들의 합의 결과를 출력하시오.
//   (프로그래밍 하시오)

import java.util.Scanner;

public class JQ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 숫자를 구할까요? ");
        int arrLen = sc.nextInt();
        arrLen = arrLen + 1;

        int[] arr = new int[arrLen];

        final int START = 3;
        int a = 0;
        int b = 0;
        int sum = 0;
        arr[1] = 1;
        arr[2] = 1;


        for(int i = START; i < arrLen; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
            if(i % 2 == 1) {
                a += i;

            } else if(i % 2 == 0){
                b += i;

            }
        }
        sum = a + b;
        System.out.println("홀수 합: " + a);
        System.out.println("짝수 합: " + b);
        System.out.println("홀수와 짝수의 합: " + sum);
    }
}
