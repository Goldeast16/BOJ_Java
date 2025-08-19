package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        int[] Ns =  new int[T];

        for (int i = 0; i < T; i++) {
            Ns[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(Ns).max().getAsInt();
        long[] dp = new long[Math.max(6, max + 1)];

        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;


        for (int j = 6; j <= max; j++) {
            dp[j] = dp[j-1] + dp[j - 5];
        }

        for (int n : Ns) {
            System.out.println(dp[n]);
        }
    }
}
