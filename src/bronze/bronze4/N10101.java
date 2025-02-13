package bronze.bronze4;

import java.util.Scanner;

public class N10101 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        int angleSum = angle1 + angle2 + angle3;

        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
        } else if (angleSum == 180) {
            if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }

    }
}
