package bronze.bronze3;

import java.io.*;

public class N11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            for (String string : input) {
                sum += Integer.parseInt(string);
            }
            System.out.println(sum);
            sum = 0;
        }

    }
}
