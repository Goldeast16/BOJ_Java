package bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N28014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int push = 1;
        int before = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (now < before) {
                before = now;
            } else {
                push++;
                before = now;
            }
        }
        System.out.println(push);
    }
}
