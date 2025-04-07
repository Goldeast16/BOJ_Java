package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            sum += Integer.parseInt(input[0]) * (Integer.parseInt(input[1]));
        }
        System.out.println(sum);
    }
}
