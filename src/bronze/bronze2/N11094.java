package bronze.bronze2;

import java.io.*;

public class N11094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("Simon") && input[1].equals("says")) {
                bw.write(" ");
                for (int j = 2; j < input.length-1; j++) {
                    bw.write(input[j] + " ");
                }
                bw.write(input[input.length-1]);
                if (i != N - 1) {
                    bw.write("\n");
                }
            }
        }
        bw.flush();
    }
}
