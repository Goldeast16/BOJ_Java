package bronze.bronze5;

import java.util.Scanner;

public class N2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print(Character.toLowerCase(ch));
            } else {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
