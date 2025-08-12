package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        int[] stepScore = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stepScore[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            dp[1] += stepScore[1];
            System.out.println(dp[1]);
            return;
        }

        if (N == 2) {
            dp[2] = stepScore[1] + stepScore[2];
            System.out.println(dp[2]);
            return;
        }

        dp[1] = stepScore[1];
        dp[2] = stepScore[1] + stepScore[2];
        dp[3] = Math.max(stepScore[1], stepScore[2]) + stepScore[3];

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + stepScore[i-1]) + stepScore[i];
        }

        System.out.println(dp[N]);
    }

}
