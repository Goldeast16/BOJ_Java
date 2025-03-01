package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N25024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine().trim());
        String check1;
        String check2;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x <= 23 && y <= 59) {
                check1 = "Yes";
            } else {
                check1 = "No";
            }

            if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
                if (y <= 31 && y >= 1) {
                    check2 = "Yes";
                } else {
                    check2 = "No";
                }
            } else if (x == 4 || x == 6 || x == 9 || x == 11) {
                if (y <= 30 && y >= 1) {
                    check2 = "Yes";
                } else {
                    check2 = "No";
                }
            } else if (x == 2) {
                if (y <= 29 && y >= 1) {
                    check2 = "Yes";
                } else {
                    check2 = "No";
                }
            } else {
                check2 = "No";
            }

            System.out.println(check1 + " " + check2);
        }
    }
}
