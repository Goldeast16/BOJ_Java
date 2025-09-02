package silver.silver4;

import java.io.*;

public class N11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] coins =  new int[N];
        int index = N - 1;
        int count = 0;

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        while (K != 0) {
            if (K < coins[index]) {
                index--;
                continue;
            }
            K -= coins[index];
            count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
