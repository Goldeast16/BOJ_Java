package bronze.bronze1;

import java.io.*;

public class N1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] filesName = new String[N];
        for (int i = 0; i < N; i++) {
            filesName[i] = br.readLine();
        }
        for (int i = 0; i < filesName[0].length(); i++) {
            char c = filesName[0].charAt(i);
            int count = 1;
            for (int j = 1; j < filesName.length; j++) {
                if (c == filesName[j].charAt(i)) {
                    count++;
                }
            }
            if (count == filesName.length) {
                bw.write(c);
            } else {
                bw.write("?");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
