package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stack =  new int[N];
        int count = -1;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String instruct =  input[0];

            switch (instruct) {
                case "push" -> {
                    count++;
                    stack[count] = Integer.parseInt(input[1]);
                }
                case "pop" -> {
                    if (count == -1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[count]);
                        count--;
                    }
                }
                case "top" -> {
                    if (count == -1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[count]);
                    }
                }
                case "empty" -> {
                    if (count == -1) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
                case "size" -> System.out.println(count + 1);
            }
        }
    }
}
