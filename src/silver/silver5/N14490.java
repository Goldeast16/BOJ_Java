package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int a = Math.max(N, M);
        int b = Math.min(N, M);
        int[] values = {a, b, 0};
        int gcd = GCD(values);
        System.out.println((N/gcd) + ":" + (M/gcd));
    }

    public static int GCD (int[] values) {
        int N = values[0];
        int M = values[1];

        int remainder = N % M;
        if (remainder > 0) {
            values[0] = M;
            values[1] = remainder;
            GCD(values);
        } else {
            values[2] = M;
        }
        return values[2];
    }
}
