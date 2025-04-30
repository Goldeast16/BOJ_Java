package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N32775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int train = Integer.parseInt(br.readLine());
        int flight = Integer.parseInt(br.readLine());

        if (train <= flight) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }
    }
}
