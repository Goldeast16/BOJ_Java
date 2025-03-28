package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;

public class N2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            ArrayList<String> words = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                words.add(br.readLine());
            }

            String first = words.get(0);
            for (int i = 1; i < words.size(); i++) {
                if (words.get(i).toLowerCase().compareTo(first.toLowerCase()) < 0) {
                    first = words.get(i);
                }
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(first + "\n");
            bw.flush();

            n = Integer.parseInt(br.readLine());
        }
    }
}
