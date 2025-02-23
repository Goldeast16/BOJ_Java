package bronze.bronze5;

import java.util.Scanner;

public class N15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(def(a, b));
    }

    public static long def(long a, long b) {
        return (a+b) * (a-b);
    }
}
