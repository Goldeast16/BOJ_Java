package bronze.bronze3;

import java.util.Scanner;

public class N30454 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine();
        int mostBeautiful = 0;
        int howMany = 0;
        String zebra;
        int count = 0;
        char before = 'n';

        for (int i = 0; i < N; i++) {
            zebra = scanner.nextLine();

            for (int j = 0; j < L; j++) {
                // 검정인지 흰색인지 판단하여 줄 갯수 셈
                if (zebra.charAt(j) == '1') {
                    // System.out.println((j+1)+"번째 글자는 " + zebra.charAt(j) + "이고 검정색");
                    // 이전 것이 검정이 아닐 때만 줄 하나 추가
                    if (before != '1') {
                        count++;
                        // System.out.println(count+"번째 줄");
                    } /* else {
                        System.out.println("아직 " + count + "번째 줄");
                    } */
                    before = '1';
                } else {
                    before = '0';
                    // System.out.println((j+1)+"번째 글자는 " + zebra.charAt(j) + "이고 흰색");
                }
            }
            // System.out.println((i+1) +"번째 말 끝");

            before = 'n';

            if (mostBeautiful < count) {
                mostBeautiful = count;
                howMany = 0;
            }

            if (count == mostBeautiful) {
                howMany++;
            }

            count = 0;

            /*
            System.out.println("mostBeautiful = " + mostBeautiful);
            System.out.println("howMany = " + howMany);
            System.out.println();
             */
        }

        System.out.println(mostBeautiful + " " + howMany);
    }
}
