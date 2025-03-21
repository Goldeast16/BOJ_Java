package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer cardA = new StringTokenizer(br.readLine());
        StringTokenizer cardB = new StringTokenizer(br.readLine());
        int aWin = 0, bWin = 0;

        for (int i = 0; i < 10; i++) {
            int aNow = Integer.parseInt(cardA.nextToken());
            int bNow = Integer.parseInt(cardB.nextToken());

            if (aNow > bNow) {
                aWin++;
            } else if (aNow < bNow) {
                bWin++;
            }
        }
        if (aWin > bWin) {
            System.out.println("A");
        } else if (aWin < bWin) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}
