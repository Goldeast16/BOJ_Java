package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class N2754 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> score = new HashMap<>();
        score.put("A+", 4.3);
        score.put("A0", 4.0);
        score.put("A-", 3.7);
        score.put("B+", 3.3);
        score.put("B0", 3.0);
        score.put("B-", 2.7);
        score.put("C+", 2.3);
        score.put("C0", 2.0);
        score.put("C-", 1.7);
        score.put("D+", 1.3);
        score.put("D0", 1.0);
        score.put("D-", 0.7);
        score.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(score.get(s));

    }
}
