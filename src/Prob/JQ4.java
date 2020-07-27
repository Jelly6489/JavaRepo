package Prob;

import java.util.Scanner;

// #4. 피보나치 수열의 n번째 항을 구하는 프로그램을 작성하시오.

public class JQ4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항을 구할까요?");
        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];
        int i;

        arr[0] = 1;
        arr[1] = 1;

        for(i = 2; i < arrLen; i++) {
            arr[i] = arr[i - 2] + arr[i-1];
        }
        System.out.printf("%d번째 항은 %d입니다.", arrLen, arr[i-1]);
    }
}

