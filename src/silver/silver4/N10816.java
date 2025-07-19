package silver.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class N10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());
        Map<Integer, Integer> numCounts = new HashMap<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            if (!numCounts.containsKey(num)) {
                numCounts.put(num, 1);
            } else {
                numCounts.compute(num, (k, count) -> count + 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        for (int i = 0; i < M-1; i++) {
            int num = Integer.parseInt(input[i]);
            if (!numCounts.containsKey(num)) {
                System.out.print("0 ");
            } else {
                System.out.print(numCounts.get(num)+" ");
            }
        }
        int num =  Integer.parseInt(input[M-1]);
        if (!numCounts.containsKey(num)) {
            System.out.println("0");
        } else {
            System.out.println(numCounts.get(num));
        }
    }
}
