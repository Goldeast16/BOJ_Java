package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N15351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int score = measureLifeScore(tokenizer);
            printScore(score);
        }
    }

    static int measureLifeScore(StringTokenizer tokenizer) {
        int score = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            for (int i = 0; i < token.length(); i++) {
                char c = token.charAt(i);
                int char2Score = (int) c - 64;
                score += char2Score;
            }
        }
        return score;
    }

    static void printScore(int score) {
        if (score == 100) {
            System.out.println("PERFECT LIFE");
        } else {
            System.out.println(score);
        }
    }
}
