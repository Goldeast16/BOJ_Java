package silver.silver3;

import java.io.*;

public class N11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] nums = new int[N + 1];
        input = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(input[i-1]);
        }

        int[] subSums = new int[N + 1];
        subSums[0] = 0;
        for (int i = 1; i <= N; i++) {
            subSums[i] = subSums[i - 1] + nums[i];
        }

        while (M--> 0) {
            input =  br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int sum = subSums[j] -  subSums[i - 1];
            bw.write(sum + "\n");
        }
        bw.flush();
        br.close();
    }
}
