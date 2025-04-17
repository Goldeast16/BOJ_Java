package bronze.bronze2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private static String classify(int n) {
        if (n == 1) return "Deficient";

        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int pair = n / i;
                if (pair != i) sum += pair;
            }
        }
        if (sum == n) return "Perfect";
        if (sum <  n) return "Deficient";
        return "Abundant";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int t = 0; t < T; t++) {
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            sb.append(classify(n)).append('\n');
        }
        System.out.print(sb.toString());
    }
}
