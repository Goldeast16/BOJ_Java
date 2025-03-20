package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N28061 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer lemons = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < N; i++) {
            int lemon = Integer.parseInt(lemons.nextToken());
            if (lemon - (N - i) > max) {
                max = lemon - (N - i);
            }
        }
        System.out.println(max);
    }
}
