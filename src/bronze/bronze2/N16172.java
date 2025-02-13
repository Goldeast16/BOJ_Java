package bronze.bronze2;
// 못 품
import java.util.Scanner;

public class N16172 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String keyWord = scanner.nextLine();
        StringBuilder noNumber = new StringBuilder();

        for (int i = 0; i < book.length(); i++) {
            char ch = book.charAt(i); // 함수 검색함

            if (Character.isLetter(ch)) { // 함수 검색함
                noNumber.append(ch);
            }
        }

        // System.out.println("noNumber = " + noNumber);

        if (noNumber.toString().contains(keyWord)) { // 함수 검색함
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}
