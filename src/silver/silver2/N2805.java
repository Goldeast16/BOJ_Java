package silver.silver2;

import java.io.*;

public class N2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input  = br.readLine().split(" ");
        int N  = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] trees = new int[N];
        int max = 0;

        input  = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(input[i]);
            if (trees[i] > max) {
                max = trees[i];
            }
        }

        int left = 0, ans = 0, right = max;
        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                    if (sum >= M) {
                        break;
                    }
                }
            }
            if (sum >= M) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(ans+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
