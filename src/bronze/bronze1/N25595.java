package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N25595 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int blackCount = 0;
        int whiteCount = 0;
        boolean isBlack = false;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int now = Integer.parseInt(st.nextToken());
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    if (now == 1) {
                        blackCount++;
                    } else if (now == 2) {
                        isBlack = true;
                    }
                } else {
                    if (now == 1) {
                        whiteCount++;
                    } else if (now == 2) {
                        isBlack = false;
                    }

                }
            }
        }

        if (isBlack) {
            if (blackCount > 0) {
                System.out.println("Kiriya");
            } else {
                System.out.println("Lena");
            }
        } else {
            if (whiteCount > 0) {
                System.out.println("Kiriya");
            } else {
                System.out.println("Lena");
            }
        }

    }
}
