package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        Set<String> nSet = new HashSet<>(Arrays.asList(input));

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            int now = Integer.parseInt(input[i]);
            if (nSet.contains(now + "")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
