package bronze.bronze3;

import java.util.ArrayList;
import java.util.Scanner;

public class N2765 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter;
        int spin;
        double time;
        double distance;

        ArrayList<String> miles = new ArrayList<>(); // ArrayList<>의 자료형은 객체만 됨
        ArrayList<String> MPH = new ArrayList<>();

        while (true) {

            diameter = scanner.nextDouble();
            spin = scanner.nextInt();
            time = scanner.nextDouble() / 3600;
            distance = diameter*3.1415927*spin / 12 / 5280; // 단위 환산 못해서 검색함

            if (spin == 0) {
                break;
            }

            miles.add(String.format("%.2f", distance)); // format 출력하는 법 익혀야 함
            MPH.add(String.format("%.2f", distance/time));

        }

        for (int i = 0; i < miles.toArray().length; i++) {
            System.out.println("Trip #" + (i+1) + ": " + miles.toArray()[i] + " " + MPH.toArray()[i]);
        }

    }
}
