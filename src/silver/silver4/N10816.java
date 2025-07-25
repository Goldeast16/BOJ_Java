package silver.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class N10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =  Integer.parseInt(br.readLine());
        Map<Integer, Integer> numCounts = new HashMap<>();
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);

            if (numCounts.containsKey(num)) {
                numCounts.put(num, numCounts.get(num) + 1);
            } else {
                numCounts.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        for (int i = 0; i < M-1; i++) {
            int num = Integer.parseInt(input[i]);
            if (numCounts.containsKey(num)) {
                bw.write(numCounts.get(num) + " ");
            } else {
                bw.write("0 ");
            }
        }

        int num =  Integer.parseInt(input[M-1]);
        if (numCounts.containsKey(num)) {
            bw.write(numCounts.get(num) + " ");
        } else {
            bw.write("0 ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
