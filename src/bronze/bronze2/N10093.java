package bronze.bronze2;

import java.util.Scanner;

public class N10093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long big, small;

        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        long count = big - small - 1;
        if (big == small) {
            count = 0;
        }
        System.out.println(count);
        for (long i = 1; i <= count; i++) {
            System.out.print(small + i);
            if (i != count) {
                System.out.print(" ");
            }
        }
    }
}
