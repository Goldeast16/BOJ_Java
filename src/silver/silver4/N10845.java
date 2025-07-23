package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class N10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String instruction = input[0];

            switch (instruction) {
                case "push" ->
                    q.add(Integer.parseInt(input[1]));
                case "pop" -> {
                    if (!q.isEmpty()) {
                        System.out.println(q.poll());
                    } else {
                        System.out.println(-1);
                    }
                }
                case "size" ->
                    System.out.println(q.size());
                case "empty" -> {
                    if (q.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
                case "front" -> {
                    if (!q.isEmpty()) {
                        System.out.println(q.peek());
                    } else {
                        System.out.println(-1);
                    }
                }
                case "back" -> {
                    if (!q.isEmpty()) {
                        System.out.println(q.peekLast());
                    } else  {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}
