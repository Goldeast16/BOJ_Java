package bronze.bronze3;

import java.util.ArrayList;
import java.util.Scanner;

public class N4153 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        ArrayList<String> result = new ArrayList<>();

        while (true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();

            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            } else if (num1 > num2 && num1 > num3) {
                if (num1*num1 - num2*num2 - num3*num3 == 0) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            } else if (num2 > num1 && num2 > num3) {
                if (num2*num2 - num1*num1 - num3*num3 == 0) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            } else if (num3 > num2 && num3 > num1) {
                if (num3*num3 - num2*num2 - num1*num1 == 0) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            }
        }

        for (String s : result) {
            System.out.println(s);
        }


    }
}
