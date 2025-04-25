package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = divideMethod(N);
        System.out.println(result);
    }

    public static int divideMethod(int N) {
        if (N < 9) {return 0;}
        int quotient = N/3;
        int result = 0;
        for (int i = 1; i <= quotient-2; i++) {
            result += i;
        }
        return result;
        // return (quotient - 1) * (quotient - 2) / 2;
    }
}
