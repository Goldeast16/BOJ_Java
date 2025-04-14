package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class N12788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] participation = br.readLine().split(" ");
        int teams = Integer.parseInt(participation[0]);
        int players = Integer.parseInt(participation[1]);
        int needPens = teams * players;
        // System.out.println(needPens);
        String[] members = br.readLine().split(" ");
        Integer[] riches = Arrays.stream(members).map(Integer::valueOf).toArray(Integer[]::new);
        Arrays.sort(riches, Collections.reverseOrder());
        // System.out.println(Arrays.toString(riches));
        int borrowed = 0;

        for (int rich : riches) {
            if (needPens > 0) {
                needPens -= rich;
                borrowed++;
                // System.out.println(needPens);
                // System.out.println(borrowed);
            } else {
                break;
            }
        }
        if (needPens <= 0) {
            System.out.println(borrowed);
        } else {
            System.out.println("STRESS");
        }
    }
}
