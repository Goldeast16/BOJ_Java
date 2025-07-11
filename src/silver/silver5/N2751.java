package silver.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(numbers[i]).append('\n');
        }
        System.out.println(sb);
    }
}
