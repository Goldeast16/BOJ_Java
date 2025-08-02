package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int[][] fibs = new int[Math.max(n + 1, 2)][2];
            fibs[0][0] = 1;
            fibs[0][1] = 0;
            fibs[1][0] = 0;
            fibs[1][1] = 1;

            for (int j = 2; j <= n; j++) {
                fibs[j][0] = fibs[j - 1][0] + fibs[j - 2][0];
                fibs[j][1] = fibs[j - 1][1] + fibs[j - 2][1];
            }

            System.out.println(fibs[n][0] + " " + fibs[n][1]);
        }
    }
}

/*
public class N1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            Counts counts = new Counts();
            int n = Integer.parseInt(br.readLine());
            fibonacci(n, counts);
            System.out.println(counts.getZeroCount() + " " + counts.getOneCount());
        }

    }

    public static int fibonacci(int n, Counts counts) {
        if (n == 0) {
            counts.plusZeroCount();
            return 0;
        } else if (n == 1) {
            counts.plusOneCount();
            return 1;
        } else {
            return fibonacci(n - 1, counts) +  fibonacci(n - 2, counts);
        }
    }
}

class Counts {
    private int zeroCount = 0;
    private int oneCount = 0;

    public int getZeroCount() {
        return zeroCount;
    }

    public int getOneCount() {
        return oneCount;
    }

    public void plusZeroCount() {
        zeroCount++;
    }

    public void plusOneCount() {
        oneCount++;
    }
}
*/