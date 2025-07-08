package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int d = 5;
        int end = 1;

        if (N == 1) {
            System.out.println(count);
        }

        while (N != 1) {
            int start = end + 1; // 2, 8, ...
            end = start + d; // 7, 19, ...
            d += 6; // 5, 11, ...
            count += 1;

            // System.out.println("start: " + start + " end: " + end + " count: " + count);

            if (start <= N && N <= end) {
                System.out.println(count);
                break;
            }
        }
    }
}
