package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _N5911 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        float sum = 0;
        int count = 0;
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            list[i][0] = Integer.parseInt(input[0]);
            list[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < N; i++) {
            // System.out.println(list[i][0] + " " + list[i][1]);
            if (sum + list[i][0] + list[i][1] <= B) {
                sum += list[i][0] + list[i][1];
                // System.out.println("sum = " + sum);
                count++;
            } else {
                break;
            }
        }

        if (sum + (float) list[count][0] / 2 + list[count][1] <= B) {
            count++;
        }

        System.out.println(count);

    }
}
