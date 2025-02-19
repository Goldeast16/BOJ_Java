package bronze.bronze1;

import java.util.Scanner;

public class N15786 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        sc.nextLine();
        String memory = sc.nextLine();
        String[] possibility = new String[M];

        for (int i = 0; i < M; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == memory.charAt(count)) {
                    // System.out.println(line.charAt(j) + "와 " + memory.charAt(count) + "가 일치");
                    count++;
                }
                if (count == N) {
                    break;
                }
            }
            if (count == N) {
                possibility[i] = "true";
            } else {
                possibility[i] = "false";
            }
            count = 0;
        }
        for (String b : possibility) {
            System.out.println(b);
        }

    }
}
