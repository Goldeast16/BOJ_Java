package silver.silver5;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class N11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();

        int M = Integer.parseInt(br.readLine());
        for  (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "add" -> set.add(Integer.parseInt(input[1]));
                case "remove" -> set.remove(Integer.parseInt(input[1]));
                case "check" -> {
                    if (set.contains(Integer.parseInt(input[1]))) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                }
                case "toggle" -> {
                    if (set.contains(Integer.parseInt(input[1]))) {
                        set.remove(Integer.parseInt(input[1]));
                    } else {
                        set.add(Integer.parseInt(input[1]));
                    }
                }
                case "empty" -> set.clear();
                case "all" -> set = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
            }
        }
        bw.flush();
        bw.close();
    }
}