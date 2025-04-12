package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);

        System.out.println(Rev(Rev(X) + Rev(Y)));
    }

    public static int Rev(int N) {
        StringBuilder rev = new StringBuilder();
        while (N != 0) {
            rev.append(N % 10);
            N /= 10;
        }
        int revNum = Integer.parseInt(rev.toString());
        return revNum;
    }
}
