package silver.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int S = 0;

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            S += A[i] * B[N-1-i];
        }
        System.out.println(S);

    }
}
