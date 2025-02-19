package bronze.bronze5;

import java.util.HashMap;
import java.util.Scanner;

public class N30087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] lectures = new String[N];
        HashMap<String, String> map = new HashMap<>(); // 안 배워서 검색함

        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        for (int i = 0; i < N; i++) {
            lectures[i] = sc.nextLine();
        }

        for (String lecture : lectures) {
            System.out.println(map.get(lecture));
        }
    }
}
