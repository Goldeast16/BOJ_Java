package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class N30970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] products = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            products[i][0] = Integer.parseInt(input[0]);
            products[i][1] = Integer.parseInt(input[1]);
        }

        Comparator<int[]> cmp =
                Comparator.comparingInt((int[] x) -> x[0])
                        .reversed()
                        .thenComparingInt(x -> x[1]);

        Arrays.sort(products, cmp);
        System.out.println(products[0][0] + " " + products[0][1] + " " + products[1][0] + " " + products[1][1]);

        cmp = Comparator.comparingInt((int[] x) -> x[1])
                        .thenComparing((a, b) ->
                                Integer.compare(b[0], a[0]));

        Arrays.sort(products, cmp);
        System.out.println(products[0][0] + " " + products[0][1] + " " + products[1][0] + " " + products[1][1]);
    }
}
