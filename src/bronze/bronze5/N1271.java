package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class N1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger N = new BigInteger(st.nextToken()); // 너무 큰 수는 BigInteger 사용해야 함.
        BigInteger M = new BigInteger(st.nextToken());


        System.out.println(N.divide(M));
        System.out.println(N.remainder(M));
    }
}
