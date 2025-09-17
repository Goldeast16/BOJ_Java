package silver.silver2;

import java.io.*;

public class N1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input =  br.readLine().split(" ");
        int K  = Integer.parseInt(input[0]);
        int N  = Integer.parseInt(input[1]);
        long[] lan = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            lan[i] = Long.parseLong(br.readLine());
            if (lan[i] > max) { max = lan[i];}
        }

        long left = 1, right = max, ans = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (long l : lan) {
                cnt += l / mid;
            }

            if (cnt >= N) {
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
