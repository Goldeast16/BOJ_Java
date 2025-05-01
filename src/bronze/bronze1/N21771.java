package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N21771 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int Rg = Integer.parseInt(input[0]);
        int Cg = Integer.parseInt(input[1]);
        int Rp = Integer.parseInt(input[2]);
        int Cp = Integer.parseInt(input[3]);

        String[][] map = new String[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().split("");
        }

    }
}
