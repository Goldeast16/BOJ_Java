package bronze.bronze3;

import java.util.Scanner;

public class N10102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        scanner.nextLine();
        String votes = scanner.nextLine();
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < V; i++) {
            char vote = votes.charAt(i);
            if (vote == 'A') {
                aCount++;
            } else if (vote == 'B') {
                bCount++;
            }
        }

        if (aCount > bCount) {
            System.out.println('A');
        } else if (bCount > aCount) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
    }
}
