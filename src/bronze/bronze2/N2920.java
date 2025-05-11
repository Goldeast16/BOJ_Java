package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        String result = adm(start, input);
        System.out.println(result);

    }

    private static String adm(int start, String[] input) {

        if (start == 1) {
            int now = start;
            for (int i = 1; i < 8; i++) {
                now++;
                if (now != Integer.parseInt(input[i])) {
                    return "mixed";
                }
            }
            return "ascending";
        } else if (start == 8) {
            int now = start;
            for (int i = 1; i < 8; i++) {
                now--;
                if (now != Integer.parseInt(input[i])) {
                    return "mixed";
                }
            }
            return "descending";
        } else {
            return "mixed";
        }
    }
}
