package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = 0;
        while (input != 0) {
            count++;
            System.out.print(count + ". ");
            int nOne = 3 * input;
            int nFour;
            if (nOne % 2 == 0) {
                System.out.print("even ");
                nFour = input/2;
            } else {
                System.out.print("odd ");
                nFour = (input - 1)/2;
            }
            System.out.print(nFour + "\n");

            input = Integer.parseInt(br.readLine());
        }
    }
}
