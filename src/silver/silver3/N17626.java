package silver.silver3;

import java.io.*;

public class N17626 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[] dp =  new int[input + 1];
        dp[0] = 0;

        for (int i = 1; i <= input; i++) {
            int best = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                best = Math.min(best, dp[i - j * j] + 1);
            }
            dp[i] = best;
        }

        bw.write(String.valueOf(dp[input]));

        bw.flush();
        br.close();
        bw.close();
    }
}
