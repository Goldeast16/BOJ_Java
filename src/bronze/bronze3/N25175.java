package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N25175 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int db = K - 3;
        if (db >= 0) {
            if ((M + db)%N == 0) {
                System.out.println(N);
            } else {
                System.out.println((M + db)%N);
            }
        } else {
            db = -db;
            db = db%N;
            if (db == 0) {
                System.out.println(M);
            } else if (M - db > 0) {
                System.out.println(M - db);
            } else {
                System.out.println((M + N) - db);
            }
        }
    }
}
