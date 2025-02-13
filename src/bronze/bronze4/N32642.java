package bronze.bronze4;

import java.util.Scanner;

public class N32642 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long anger = 0L;
        long totalAnger = 0L;
        int days = scanner.nextInt();
        for (int i = 0; i < days; i++) {
            int today = scanner.nextInt();
            if (today == 0) {
                anger -= 1;
            } else {
                anger += 1;
            }
            totalAnger += anger;
        }
        System.out.println(totalAnger);
    }
}
