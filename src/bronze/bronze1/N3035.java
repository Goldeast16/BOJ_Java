package bronze.bronze1;

import java.util.Scanner;

public class N3035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ZR = sc.nextInt();
        int ZC = sc.nextInt();
        sc.nextLine();

        String[][] paper = new String[R][C];
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                paper[i][j] = String.valueOf(line.charAt(j));
            }
        }
        for (int i = 0; i < R; i++) {
            for (int zr = 0; zr < ZR; zr++) {
                for (int j = 0; j < C; j++) {
                    for (int zc = 0; zc < ZC; zc++) {
                        System.out.print(paper[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
