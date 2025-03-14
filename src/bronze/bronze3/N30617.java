package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N30617 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] actions = new int [N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            actions[i][0] = l;
            actions[i][1] = r;
        }
        measureExcitement(actions);
    }

    static void measureExcitement(int[][] actions) {
        int excitements = 0;
        if (actions[0][0] == actions[0][1] && actions[0][0] != 0) {
            excitements++;
        }
        for (int i = 1; i < actions.length; i++) {
            if (actions[i][0] == actions[i][1] && actions[i][0] != 0) {
                excitements++;
            }
            if (actions[i][0] == actions[i-1][0] && actions[i][0] != 0) {
                excitements++;
            }
            if (actions[i][1] == actions[i-1][1] && actions[i][1] != 0) {
                excitements++;
            }
        }
        System.out.println(excitements);
    }
}
