package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A, B;

        String[] input = br.readLine().split(" ");
        if (Integer.parseInt(input[0]) >= Integer.parseInt(input[1])) {
            A = Integer.parseInt(input[0]);
            B = Integer.parseInt(input[1]);
        } else {
            B = Integer.parseInt(input[0]);
            A = Integer.parseInt(input[1]);
        }

        int GCD = getGCD(A, B);
        System.out.println(GCD);
        System.out.println(getLCM(GCD, A, B));
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getLCM(int GCD, int a, int b) {
        int aQuo = a / GCD;
        int bQuo = b / GCD;

        return GCD * aQuo * bQuo;
    }

}
