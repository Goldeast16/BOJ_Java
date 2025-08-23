package silver.silver3;

import java.io.*;

public class N11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] dp =  new int[Math.max(3, N + 1)];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] % 10007 + dp[i - 2] % 10007;
        }
        int result = dp[N] % 10007;
        bw.write(result + "");
        bw.flush();
    }
}
