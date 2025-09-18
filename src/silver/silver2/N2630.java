package silver.silver2;

import java.io.*;
import java.util.*;

public class N2630 {
    static int white = 0;
    static int blue = 0;

    public static void divideAndConquer(int[][] paper, int size) {
        if (Arrays.stream(paper)
                .flatMapToInt(Arrays::stream)
                .noneMatch(x -> x == 0)) {
            blue++;
            return;
        } else if (Arrays.stream(paper)
                .flatMapToInt(Arrays::stream)
                .noneMatch(x -> x == 1)) {
            white++;
            return;
        }

        int[][][] subPaper = new int[4][size/2][size/2];
        for (int i = 0; i < size/2; i++) {
            System.arraycopy(paper[i], 0, subPaper[0][i], 0, size/2);
        }
        for (int i = 0; i < size/2; i++) {
            System.arraycopy(paper[i], size/2, subPaper[1][i], 0, size/2);
        }
        for (int i = 0; i < size/2; i++) {
            System.arraycopy(paper[i + size/2], 0, subPaper[2][i], 0, size/2);
        }
        for (int i = 0; i < size/2; i++) {
            System.arraycopy(paper[i + size/2], size/2, subPaper[3][i], 0, size/2);
        }

        for (int[][] sub : subPaper) {
            divideAndConquer(sub, size/2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N =  Integer.parseInt(br.readLine());

        int[][] paper =  new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(input[j]);
            }
        }

        divideAndConquer(paper, N);

        bw.write(white + "\n");
        bw.write(blue+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
