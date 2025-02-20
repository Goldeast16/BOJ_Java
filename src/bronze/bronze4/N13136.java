package bronze.bronze4;

import java.util.Scanner;

public class N13136 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        long A;
        long B;

        if (R % N != 0) {
            A = (long) R / N + 1;
        } else {
            A = (long) R / N;
        }

        if (C % N != 0) {
            B = (long) C / N + 1;
        } else {
            B = (long) C / N;
        }

        System.out.println(A*B);

    }
}
