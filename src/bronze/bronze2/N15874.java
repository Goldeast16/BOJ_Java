package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N15874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        String origin = br.readLine();

        for (int i = 0; i < s; i++) {
            char now = origin.charAt(i);
            if ('A' <= now && now <= 'Z') {
                now = (char) ((now - 'A' + K) % 26 + 'A');
                System.out.print(now);
            } else if ('a' <= now && now <= 'z') {
                now = (char) ((now - 'a' + K) % 26 + 'a');
                System.out.print(now);
            } else {
                System.out.print(now);
            }
        }
    }
}
