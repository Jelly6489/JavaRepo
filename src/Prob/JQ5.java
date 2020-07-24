package Prob;

public class JQ5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for(int i = 1; i <= 10; i++){
            if(i %3 == 0) a += i;
            else if(i /3 == 1) b = a * i;
            else if(i /3 == 2) c = b - i;
            d = a + b + c;
            System.out.println(d);

        }
    }
}
