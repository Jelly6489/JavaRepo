package Prob;

import java.util.Scanner;

public class JQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항까지 반복할까요?");
        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];
        int i;
        int sum = 0;

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for(i = 3; i < arrLen; ++i) {
            arr[i] = arr[i - 3] + arr[i-1];
            if(arr[i] %2 == 0) {
                sum += arr[i];
            }
        }
            System.out.println(sum);
    }
}