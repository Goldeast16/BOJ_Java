package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(card2(N));
    }

    public static int card2(int N) {
        int index = 1;
        int result = 0;

        if (N == 1 || N == 2) {
            result = N;
        } else if (N == 3) {
            result = 2;
        } else {
            for (int i = 3; i < N; i++) {
                if (index + 1 == i) {
                    result = 2;
                } else {
                    result = index + 3;
                }
                index = result - 1;
            }
        }
        return result;
    }
}
