package bronze.bronze1;

import java.io.*;

public class N17283 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int R = Integer.parseInt(br.readLine());
        int sumLength = 0;
        int branchCount = 1;
        L = L * R / 100;

        while (L > 5) {
            branchCount *= 2;
            sumLength += L * branchCount;
            L = L * R / 100;
        }

        System.out.println(sumLength);
    }
}
