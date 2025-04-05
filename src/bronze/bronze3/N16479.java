package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N16479 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String[] Ds = br.readLine().split(" ");
        int D1 = Integer.parseInt(Ds[0]);
        int D2 = Integer.parseInt(Ds[1]);

        float diff = (float) D1/2 - (float) D2/2;
        float heightSquared = K*K - diff*diff;

        if (heightSquared % 1 == 0) {
            System.out.println((int)heightSquared);
        } else {
            System.out.println(heightSquared);
        }


    }
}
