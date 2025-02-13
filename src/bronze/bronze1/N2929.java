package bronze.bronze1;
// 못품
import java.util.Scanner;

public class N2929 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        int needNOP = 0;
        int lowerCount = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (Character.isUpperCase(ch)) {
                if (i != 0) { // 첫 번째 명령어는 검사하지 않음
                    if (lowerCount < 3) {
                        needNOP += (3 - lowerCount);
                        lowerCount = 0;
                    } else {
                        lowerCount -= 3; // 남은 소문자는 다음 명령어의 매개변수로 이어짐
                    }
                }
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        System.out.println(needNOP);


        /*
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        int needNOP = 0;
        int lowerCount = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (i != 0 && Character.isUpperCase(ch)) {
                if (lowerCount < 3) {
                    needNOP += (3-lowerCount);
                    lowerCount = 0;
                } else if (lowerCount == 3) {
                    lowerCount = 0;
                } else if (lowerCount == 4) {
                    needNOP += 3;
                    lowerCount = 0;
                }
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        System.out.println(needNOP);
         */
    }
}
