package bronze.bronze1;

import java.util.Scanner;

public class N20362 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();  // 정수를 읽음
        String winner = scanner.next();    // 공백 기준으로 단어를 읽음, 검색함
        String[] nameList = new String[number];
        String[] chatList = new String[number];
        int count = 0;
        String answer = "";

        for (int i = 0; i < number; i++) {
            String name = scanner.next();
            nameList[i] = name;
            String chat = scanner.next();
            chatList[i] = chat;

            if (name.equals(winner)) {
                answer = chat;
            }
        }

        for (int i = 0; i < number; i++) {

            if (nameList[i].equals(winner)) {
                break;
            }

            if (chatList[i].equals(answer)) {
                count++;
            }
        }

        System.out.println(count);

    }
}
