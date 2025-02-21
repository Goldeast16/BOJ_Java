package bronze.bronze3;

import java.util.Scanner;

public class N2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int min = 0;
        int sum = -1;

        for (int i = 0; i < 7; i++) {
             number = sc.nextInt();
             if (number % 2 == 1) {
                 sum += number;
             }

             if (number % 2 == 1 && min == 0) {
                 min = number;
                 sum += 1;
             } else if (number % 2 == 1 && number < min) {
                 min = number;
             }
        }

        if (min == 0) {
            System.out.println(sum);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
