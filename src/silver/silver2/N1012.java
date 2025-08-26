package silver.silver2;

import java.io.*;
import java.util.*;

public class N1012 {

    static int N, M;
    static int[][] farm;
    static boolean[][] visited;
    static final int[] DY = {-1, 1, 0, 0};
    static final int[] DX = {0, 0, -1, 1};

    static int countWarm() {
        int count = 0;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                if (farm[y][x] == 1 && !visited[y][x]) {
                    bfs(y, x);
                    count++;
                }
            }
        }
        return count;
    }

    static void bfs(int sy, int sx) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sy, sx});
        visited[sy][sx] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0], x = cur[1];

            for (int d = 0; d < 4; d++) {
                int ny = y + DY[d];
                int nx = x + DX[d];
                if (ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
                if (farm[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.offer(new int[]{ny, nx});
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            farm = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[y][x] = 1;
            }

            out.append(countWarm()).append('\n');
        }
        System.out.print(out);
    }
}
