package bronze.bronze1;
// 왜 안됨??
import java.util.Scanner;

public class _N2929 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        int count = 0;
        int processorCount = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            System.out.println((i+1)+"번째 글자: " + c);
            if (i == 0 && Character.isUpperCase(c)) {
                // System.out.println("첫번째 글자임");
                count++;
            } else if (Character.isUpperCase(c)) {
                // System.out.println("다시 명령어");
                if (count % 4 == 0) {
                    // System.out.println("지금까지 파라미터 3개");
                    count = 0;
                } else {
                    // System.out.println("지금까지 파라미터 " + (4-count) + "개");
                    processorCount += 4 - count;
                    count = 0;
                }
                count++;
            } else {
                // System.out.println("파라미터");
                count++;
            }
            processorCount++;

            // System.out.println("count = " + count);
            // System.out.println("processorCount = " + processorCount);
            // System.out.println("NOP의 수: " + (processorCount - (i+1)));
        }

        System.out.println(processorCount - code.length());

    }
}
