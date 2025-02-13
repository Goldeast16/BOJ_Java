package bronze.bronze3;

import java.util.Scanner;

public class N18127 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int particle = 1; // 오버플로우 일어날 수 있으니 Long으로 바꿔야 함
        int edge = 1; // 오버플로우 일어날 수 있으니 Long으로 바꿔야 함

        for (int i = 0; i <= B; i++) {
            if (i == 0) {
                particle = 1;
            } else if (i == 1) {
                particle = A;
                edge = particle - 1;
            } else {
                edge += A - 2;
                particle += edge;
            }
        }
        System.out.println(particle);
    }
}
