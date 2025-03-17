package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N30503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer flowers = new StringTokenizer(br.readLine());
        int[] field = new int[N];
        for (int i = 0; i < N; i++) {
            field[i] = Integer.parseInt(flowers.nextToken());
        }
        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            StringTokenizer Query = new StringTokenizer(br.readLine());
        }
    }
}
