package silver.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class N10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Object[][] array = new Object[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            array[i][0] = age;
            array[i][1] = i;
            array[i][2] = name;
        }

        Arrays.sort(array, Comparator
                .comparing((Object[] row) -> (int) row[0])
                .thenComparing(row -> (int) row[1])
        );

        for (int i = 0; i < N; i++) {
            System.out.println(array[i][0] + " " + array[i][2]);
        }

        br.close();
    }
}
