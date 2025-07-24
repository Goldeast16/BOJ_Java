package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] players =  new int[N];
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            players[i-1] = i;
        }

        int count = 1;
        int iter = 0;

        while (!Arrays.stream(players).allMatch(x -> x == -1)) {
            if (iter % N == 0) {
                iter = 0;
            }
            if (players[iter] == -1) {
                iter++;
            } else {
                if (count == K) {
                    sb.append(players[iter]).append(", ");
                    players[iter] = -1;
                    count = 0;
                }
                iter++;
                count++;
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);

    }
}
