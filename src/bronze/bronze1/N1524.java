package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String empty = br.readLine();
            int sMax = 0, bMax = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            StringTokenizer sj = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int now = Integer.parseInt(sj.nextToken());
                if (sMax < now) {
                    sMax = now;
                }
            }

            StringTokenizer sb = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int now = Integer.parseInt(sb.nextToken());
                if (bMax < now) {
                    bMax = now;
                }
            }

            if (sMax < bMax) {
                System.out.println("B");
            } else {
                System.out.println("S");
            }
        }
    }
}
