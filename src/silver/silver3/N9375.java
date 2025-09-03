package silver.silver3;

import java.io.*;
import java.util.HashMap;

public class N9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothes = new HashMap<>();
            int count = 1;

            for  (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                if (!clothes.containsKey(input[1])) {
                    clothes.put(input[1], 1);
                } else {
                    clothes.put(input[1], clothes.get(input[1]) + 1);
                }
            }

            for (String s : clothes.keySet()) {
                count *= clothes.get(s) + 1;
            }

            count--;
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
