package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        while (!input[0].equals("0")) {
            int N = Integer.parseInt(input[0]);
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input[i+1]);
            }

            int before = arr[0];
            System.out.print(before + " ");
            for (int i = 1; i < N; i++) {
                if (arr[i] != before) {
                    System.out.print(arr[i] + " ");
                }
                before = arr[i];
            }
            System.out.println("$");
            input = br.readLine().split(" ");
        }
    }
}
