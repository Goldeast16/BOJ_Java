package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String now = "";
        int maxLength = 0;
        String maxWord = "";

        while (!now.equals("E-N-D")) {
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                now = input[i].replaceAll("[^a-zA-Z-]", "");
                int count = now.length();
                if (count > maxLength) {
                    maxLength = count;
                    maxWord = now;
                }
            }
        }
        System.out.println(maxWord.toLowerCase());
    }
}
