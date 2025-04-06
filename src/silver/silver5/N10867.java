package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class N10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<Integer>();
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(input[i]));
        }

        Object[] result = set.toArray();
        Arrays.sort(result);
        System.out.print(result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }
}
