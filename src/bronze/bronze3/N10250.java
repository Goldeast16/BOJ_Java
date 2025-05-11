package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);
            String room = "";

            String floor = String.valueOf((N-1)%H + 1);
            if (N >= H) {
                room = String.valueOf(N);
            } else {
                room = String.valueOf(N/H + 1);
            }

            if (room.length() == 1) {
                room = "0" + room;
            }
            System.out.println(floor + room);
        }
    }
}
