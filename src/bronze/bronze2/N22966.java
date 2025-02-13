package bronze.bronze2;

// scanner Line읽기 오류 GPT 도음 받음

import java.util.Scanner;

public class N22966 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lowLevel = 5;
        String lowName = "";
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String name = scanner.next(); // 한줄 전체를 읽는 것이 아닌 공백을 기준으로 이름 읽기
            int level = scanner.nextInt();

            if (level < lowLevel) {
                lowLevel = level;
                lowName = name;
            }
        }
        System.out.println(lowName);
    }
}
