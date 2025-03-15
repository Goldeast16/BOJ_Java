package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String token1 = st.nextToken();
            String token2 = st.nextToken();
            measureDistance(token1, token2);
        }
    }

    static void measureDistance (String token1, String token2) {

        System.out.print("Distances:");
        for (int i = 0; i < token1.length(); i++) {
            if (token2.charAt(i) >= token1.charAt(i)) {
                System.out.print(" ");
                System.out.print((int) token2.charAt(i) - (int) token1.charAt(i));
            } else {
                System.out.print(" ");
                System.out.print(26 + token2.charAt(i) - token1.charAt(i));
            }
        }
        System.out.println();
    }
}
