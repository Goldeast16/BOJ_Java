package bronze.bronze3;

import java.util.Scanner;

public class N10178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C;
        int V;

        for (int i = 0; i < N; i++) {
            C = sc.nextInt();
            V = sc.nextInt();

            System.out.println("You get " + (C/V) + " piece(s) and your dad gets " + (C%V) + " piece(s)");
        }
    }
}
