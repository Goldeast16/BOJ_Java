package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        System.out.println("FA");
        /*
        int count = 0;
        int before = Integer.parseInt(input[0]) * input.length;
        boolean isFA = false;

        while (true) {
            System.out.println(before);
            if (before / 10 == 0) {
                isFA = true;
                break;
            }
            String[] nowString = String.valueOf(before).split("");
            int now = Integer.parseInt(nowString[0]) * nowString.length;
            before = now;
        }

        if (isFA) {
            System.out.println("FA");
        } else {
            System.out.println("NFA");
        }
        */
    }
}
