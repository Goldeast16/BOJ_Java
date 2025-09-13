package silver.silver2;

import java.io.*;

public class N1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("-");
        int sum = 0;
        int subsum = 0;

        String[] subequation = input[0].split("\\+");
        for (String num : subequation) {
            subsum += Integer.parseInt(num);
        }
        sum += subsum;
        subsum = 0;

        for (int i = 1; i < input.length; i++) {
            subequation = input[i].split("\\+");
            for (String num : subequation) {
                subsum += Integer.parseInt(num);
            }
            sum -= subsum;
            subsum = 0;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
