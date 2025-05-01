package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N16495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sum = 0;
        int leng = input.length();

        for (int i = 0; i < leng; i++) {
            char c = input.charAt(i);
            sum = sum * 26 + (c - 'A' + 1);
        }

        System.out.println(sum);

    }
}
