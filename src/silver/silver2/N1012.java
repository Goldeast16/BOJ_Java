package silver.silver2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class N1012 {

    public static int countWarm(int[][] farm, int[][] visited, int K) {
        int count = 0;

        for  (int i = 0; i < farm.length; i++) {
            for (int j = 0; j < farm[0].length; j++) {
                if (farm[i][j] == 1 && visited[i][j] == 0) {
                    K -= bfs(farm, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static int bfs (int[][] farm, int[][] visited, int i, int j) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        visited[i][j] = 1;
        count++;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            if (x > 0 && farm[x - 1][y] == 1 && visited[x - 1][y] == 0) {
                visited[x - 1][y] = 1;
                queue.add(new int[] {x - 1, y});
                count++;
            }
            if (x < farm.length - 1 && farm[x + 1][y] == 1 && visited[x + 1][y] == 0) {
                visited[x + 1][y] = 1;
                queue.add(new int[] {x + 1, y});
                count++;
            }
            if (y > 0 && farm[x][y - 1] == 1 && visited[x][y - 1] == 0) {
                visited[x][y - 1] = 1;
                queue.add(new int[] {x, y - 1});
                count++;
            }
            if (y < farm[0].length - 1 && farm[x][y + 1] == 1 && visited[x][y + 1] == 0) {
                visited[x][y + 1] = 1;
                queue.add(new int[] {x, y + 1});
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T--> 0) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            int[][] farm = new int[M][N];
            int[][] visited = new int[M][N];

            for (int i = 1; i <= K; i++) {
                input = br.readLine().split(" ");
                farm[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = 1;
            }

            System.out.println(countWarm(farm, visited, K));
        }
    }
}
