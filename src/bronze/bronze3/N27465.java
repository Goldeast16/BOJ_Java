package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N27465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 2 || N == 1) {
            System.out.println(4);
        } else if (N % 2 == 0) {
            System.out.println(N);
        } else {
            System.out.println(N + 1);
        }
    }
}
