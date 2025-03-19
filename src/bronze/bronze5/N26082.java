package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N26082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(calculatePerformancePerCost(A, B, C));
    }

    public static int calculatePerformancePerCost(int oppositeCost, int oppositePerformance, int ourCost) {
        return 3 * (oppositePerformance / oppositeCost * ourCost);
    };
}
