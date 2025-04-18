package bronze.bronze1;

import java.util.Scanner;

public class N11005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        StringBuilder result = new StringBuilder(); // 검색함

        while (N > 0) {
            int remainder = N % B;
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + (remainder - 10));
            // N진수 변환법 몰라서 검색함
            result.append(digit);
            N /= B;
        }
        String answer = result.reverse().toString();
        System.out.println(answer);
        
    }
}
