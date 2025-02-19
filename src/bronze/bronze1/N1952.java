package bronze.bronze1;

import java.util.Scanner;

public class N1952 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int curve = 0;

        while (M != 0 && N != 0) {
            switch (curve % 2) {
                case 0: {
                    M--;
                    curve++;
                    break;
                }
                case 1: {
                    N--;
                    curve++;
                    break;
                }
            }
        }
        curve--;
        System.out.println(curve);

    }
}
