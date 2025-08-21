package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9095 {
    static int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800};

    public static int findMethod (int n) {
        int count = 0;

        for (int i = n/3; i >= 0; i--) {
            for (int j = (n - 3*i)/2; j >= 0; j--) {
                int ones = n - 3*i - 2*j;
                int length = i + j + ones;
                count += combination(length, i) * combination(length - i, j);
            }
        }
        return count;
    }

    public static int combination (int n, int k) {
        return factorials[n]/(factorials[k] * factorials[n-k]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(findMethod(n));
        }
    }
}
