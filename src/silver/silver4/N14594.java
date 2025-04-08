package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N14594 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rooms = new int[N];
        for (int i = 0; i < N; i++) {
            rooms[i] = 1;
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] xAndY = br.readLine().split(" ");
            int x = Integer.parseInt(xAndY[0]);
            int y = Integer.parseInt(xAndY[1]);

            for (int j = x; j < y; j++) {
                rooms[j] = 0;
            }
        }
        System.out.println(Arrays.stream(rooms).sum());

    }
}
