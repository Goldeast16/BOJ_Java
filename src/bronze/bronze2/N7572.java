package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year= Integer.parseInt(br.readLine().trim());
        int gan = 0;
        int easy = 'G';
        System.out.println((int)easy);
        System.out.println((int)'A');
        System.out.println((int)'L');

        if (year >= 2013) {
            for (int i = 2013; i <= year; i++) {
                if (gan != 9) {
                    gan++;
                } else {
                    gan = 0;
                }
                if (easy != 'L') {
                    easy += 1;
                } else {
                    easy = 'A';
                }
            }
        } else {
            int now = 2013;
            while (true) {
                now--;
                if (gan != 0) {
                    gan--;
                } else {
                    gan = 9;
                }
                if (easy != 'A') {
                    easy -= 1;
                } else {
                    easy = 'L';
                }
                if (now == year); {
                    break;
                }
            }
        }
        System.out.print((char)easy);
    }
}
