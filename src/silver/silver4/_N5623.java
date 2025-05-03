package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _N5623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[][] S = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(input[j]);
            }
        }


        /*
        S(i,j) = A[i] + A[j]
        S(1, 2) = 3 = A[1] + A[2]
        S(2, 3) = 5 = A[2] + A[3]
        S(1, 3) = 6 = A[1] + A[3}

        A[1] - A[2] = 1
        A[1] + A[2] = 3
        A[2] = 2
         */

    }
}
