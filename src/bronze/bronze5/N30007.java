package bronze.bronze5;

import java.util.Scanner;

public class N30007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] wList = new int[N];

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int X = scanner.nextInt();

            int W = A * (X - 1) + B;
            wList[i] = W;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(wList[i]);
        }
    }
}
