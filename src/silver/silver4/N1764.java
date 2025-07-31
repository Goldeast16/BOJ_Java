package silver.silver4;

import java.io.*;
import java.util.HashSet;

public class N1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashSet<String> nugu_hearing =  new HashSet<>();
        HashSet<String> real_nugu = new HashSet<>();

        for (int i = 0; i < N; i++) {
            nugu_hearing.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String nugu_seeing = br.readLine();
            if (nugu_hearing.contains(nugu_seeing)) {
                real_nugu.add(nugu_seeing);
            }
        }

        System.out.println(real_nugu.size());
        real_nugu.stream().sorted().forEach(System.out::println);
    }

}
