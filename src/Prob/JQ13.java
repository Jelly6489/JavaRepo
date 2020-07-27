package Prob;

// #13. 1, 3, 4, 7, 11, 18, 29, 47, 76, ... 형태로 숫자가 진행된다.
//    23번째 숫자는 무엇일까 ?
//    (프로그래밍 하시오)

import java.util.Scanner;

public class JQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 숫자를 구할까요? ");
        int arrLen = sc.nextInt();
        arrLen = arrLen + 1;

        int[] arr = new int[arrLen];

        arr[1] = 1;
        arr[2] = 3;

        final int START = 3;

        for(int i = START; i < arrLen; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
            System.out.printf("%d 번째 값은 %d\n", i, arr[i]);
        }
    }
}
