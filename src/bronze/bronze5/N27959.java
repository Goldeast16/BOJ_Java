package bronze.bronze5;

import java.util.Scanner;

public class N27959 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() * 100;
        int price = sc.nextInt();

        if (price <= N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
