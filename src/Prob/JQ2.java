package Prob;

import java.util.Scanner;

// #2. 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, ...
// 위의 수열에서 2의 배수를 찾아 모두 더하는 함수를 작성하시오.
// 범위는 50번째 항까지 계산하도록 한다.

public class JQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항까지 반복할까요? ");
        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];
        int i;
        int sum = 0;

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for(i = 3; i < arrLen; i++) {
            arr[i] = arr[i - 3] + arr[i-1];
            if(arr[i] %2 == 0) {
                sum += arr[i];
            }
        }
        System.out.printf("%d 번째 항의 값은 %d입니다. \n", i, sum);
    }
}