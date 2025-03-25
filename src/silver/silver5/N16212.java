package silver.silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N-1; i++) {
            bw.write(numbers[i] + " ");
        }
        bw.write(String.valueOf(numbers[N-1]));
        bw.flush();
    }
}
