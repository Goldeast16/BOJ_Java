package silver.silver4;

import java.io.*;
import java.util.HashMap;

public class N17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, String> IDnPW = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            IDnPW.put(input[0], input[1]);
        }

        for (int i = 1; i <= M; i++) {
            input = br.readLine().split(" ");
            bw.write(IDnPW.get(input[0]) + "\n");
        }
        bw.flush();
        br.close();
    }
}
