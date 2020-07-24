package Prob;

public class JQ1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++){
            if (i %2 == 0) {
                sum += i;
            }
        }
        System.out.println("1~100까지 짝수의 합:" + sum);
    }
}
