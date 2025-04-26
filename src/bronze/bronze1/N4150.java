package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger result;
        result = fibo(n);
        System.out.println(result);

    }

    private static BigInteger fibo(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        BigInteger before1 = BigInteger.ONE;
        BigInteger before2 = BigInteger.ONE;
        BigInteger now;

        for (int i = 3; i <= n; i++) {
            now = before1.add(before2);
            before2 = before1;
            before1 = now;
        }
        return before1;
    }
}
