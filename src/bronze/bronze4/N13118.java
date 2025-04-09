package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N13118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coordinates = new int[4];
        String[] input = br.readLine().split(" ");
        int died = 0;
        for (int i = 0; i < 4; i++) {
            coordinates[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int radius = Integer.parseInt(input[2]);

        for (int j = 0; j < coordinates.length; j++) {
            if (X == coordinates[j]) {
                died = j+1;
                break;
            }
        }
        System.out.println(died);
    }
}
