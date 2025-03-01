package bronze.bronze4;

import java.util.Scanner;

public class N15700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        if (N == 1) {
            System.out.println(M/2);
        } else if (M == 1) {
            System.out.println(N/2);
        } else if (N % 2 == 0) {
            System.out.println((N/2) * M);
        } else {
            System.out.println((N/2) * M + M/2);
        }
    }
}
