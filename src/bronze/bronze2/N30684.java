package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N30684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String chairman = "ZZZ";

        for (int i = 0; i < N; i++) {
            String member = br.readLine();

            if (member.length() != 3) {
                continue;
            }

            if (member.compareTo(chairman) < 0) {
                    chairman = member;
            }

        }
        System.out.println(chairman);
    }
}
