package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class N15780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nAndK = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(nAndK.nextToken());
        int K = Integer.parseInt(nAndK.nextToken());
        int[] multi = new int[K];
        String available = "NO";

        StringTokenizer holes = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            multi[i] = Integer.parseInt(holes.nextToken());
        }

        int count = 0;
        for (int now : multi) {
            count += now/2 + now%2;
            if (count >= N) {
                available = "YES";
                break;
            }
        }

        System.out.println(available);
    }
}
