package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sizes = br.readLine().split(" ");
        String[] TnP = br.readLine().split(" ");
        int T = Integer.parseInt(TnP[0]);
        int P = Integer.parseInt(TnP[1]);

        int TBundles = 0;
        int PBundles = N / P;
        int PIndi = N - (P * PBundles);

        for (String size : sizes) {
            int sizeInt = Integer.parseInt(size) - 1;
            if (sizeInt < 0) {
                continue;
            }
            TBundles += (sizeInt / T) + 1;
        }

        System.out.println(TBundles);
        System.out.println(PBundles + " " + PIndi);

    }
}
