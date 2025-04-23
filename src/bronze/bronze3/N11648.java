package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 1;
        int count = 0;

        while (input.length() > 1) {
            for (String num : input.split("")) {
                result *= Integer.parseInt(num);
            }
            input = String.valueOf(result);
            result = 1;
            count++;
        }
        System.out.println(count);
    }
}
