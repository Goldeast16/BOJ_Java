package bronze.bronze3;

// 배열 아직 안 배워서 배열 부분만 선언하는 법 배움

import java.util.Scanner;

public class N9501 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            int count = 0;
            int N = scanner.nextInt();
            int D = scanner.nextInt();

            for (int j = 0; j < N; j++) {
                int v_j = scanner.nextInt();
                int f_j = scanner.nextInt();
                int c_j = scanner.nextInt();

                double engineOnTime = (double) f_j / c_j;
                double workDistance = engineOnTime * v_j;
                double isArrive = workDistance/D;

                if (isArrive >= 1) {
                    count ++;
                }
            }
            result[i] = count;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}
