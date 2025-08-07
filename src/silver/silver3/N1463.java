package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1463 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        System.out.println(findShortCut(n) - 1);
    }

    static int findShortCut (int num) {
        if (dp[num] == 0) {

            if (num % 6 == 0) {
                dp[num] = Math.min(findShortCut(num / 3), findShortCut(num / 2)) + 1;
            } else if (num % 3 == 0) {
                dp[num] =  Math.min(findShortCut(num / 3), findShortCut(num - 1)) + 1;
            } else if (num % 2 == 0) {
                dp[num] =  Math.min(findShortCut(num / 2), findShortCut(num - 1)) + 1;
            } else {
                dp[num] = findShortCut(num - 1) + 1;
            }
        }
        return dp[num];
    }
}