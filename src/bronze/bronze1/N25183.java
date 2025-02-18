package bronze.bronze1;

import java.util.Scanner;

public class N25183 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        char before = '0';
        char now;
        int count = 1;
        boolean goal = false;
        String lottery = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            now = lottery.charAt(i);

            // 첫 글자는 패스
            if (i == 0) {
                before = now;
                // System.out.println((i+1)+"번째 글자: " + now);
            } else {
                // System.out.println("이전 글자: " + before + ", " + (i+1)+"번째 글자: " + now);
                // 현 글자가 Z일 때
                if (now == 'Z') {
                    // before와 연결되면
                    if (before == 'Y') {
                        count++;
                        before = now;
                        // System.out.println("이전 글자와 이어짐");
                    } else {
                        before = now;
                        count = 1;
                    }
                } else if (now == 'A') { // 현 글자가 A일 때
                    // before와 연결되면
                    if (before == 'B') {
                        count++;
                        before = now;
                        // System.out.println("이전 글자와 이어짐");
                    } else {
                        before = now;
                        count = 1;
                    }
                } else { // 현 글자가 A, Z가 아닐 때
                    if (now == (before-1) || now == (before+1)) {
                        count++;
                        before = now;
                        // System.out.println("이전 글자와 이어짐");
                    } else {
                        before = now;
                        count = 1;
                    }

                }
            }

            if (count == 5) {
                goal = true;
            }
        }
        System.out.println(goal ? "YES" : "NO");
    }
}
