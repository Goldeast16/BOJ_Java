package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N31882 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count = 0;
        long score = 0L;

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (current == 2) {
                count++;
            } else {
                for (int k = 1; k <= count; k++) {
                    score += (long) k * (count - (k - 1));
                }
                count = 0;
            }
        }
        for (int k = 1; k <= count; k++) {
            score += (long) k * (count - (k - 1));
        }
        System.out.println(score);
    }
}
