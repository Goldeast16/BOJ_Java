package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < T; i++) {
            System.out.println(solve(Integer.parseInt(input[i])));
        }

    }

    public static int solve(int num) {
        int sum = 0;
        int quotient3 = num / 3;
        int quotient7 = num / 7;
        int quotient21 = num / 21;
        sum += quotient3 * (6 + 3 * (quotient3 - 1)) / 2;
        sum += quotient7 * (14 + 7 * (quotient7 - 1)) / 2;
        sum -= quotient21 * (42 + 21 * (quotient21 - 1)) / 2;

        return sum;
    }
}
