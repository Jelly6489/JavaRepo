package Prob;

import java.util.Scanner;

// #3. 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, ...
// 위와 같은 수열의 30번째 항을 구하는 프로그램을 작성하시오.

public class JQ3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항을 구할까요?");
        int arrLen = scan.nextInt();
        arrLen = arrLen +1;

        int[] arr = new int[arrLen];
        int i;
        int sum = 0;

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for (i = 3; i < arrLen; i++) {
            arr[i] = arr[i - 3] + arr[i - 1];
            sum += arr[i];
            System.out.printf("%d번째 항은 %d입니다.\n", i, arr[i]);
        }
    }
}

