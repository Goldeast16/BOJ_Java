package bronze.bronze4;

import java.io.*;

public class N4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] texts = new String[N];
        for (int i = 0; i < N; i++) {
            texts[i] = br.readLine();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write((i+1) + ". " + texts[i] + "\n");
            bw.flush();
        }
    }
}
