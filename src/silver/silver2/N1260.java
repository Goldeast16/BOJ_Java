package silver.silver2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class N1260 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;

    static void dfs(int node) throws  IOException {
        visited[node] = true;
        bw.write(node + " ");

        int[] next = new int[graph.get(node).size()];
        for (int i = 0; i < next.length; i++) {
            next[i] = graph.get(node).get(i);
        }
        next = Arrays.stream(next).sorted().toArray();

        for (int i : next) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int V) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        visited[V] = true;
        q.add(V);

        while (!q.isEmpty()) {
            int node = q.poll();
            bw.write(node + " ");
            int[] next = new int[graph.get(node).size()];
            for (int i = 0; i < next.length; i++) {
                next[i] = graph.get(node).get(i);
            }
            next = Arrays.stream(next).sorted().toArray();
            for (int i : next) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input  = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            input = br.readLine().split(" ");
            int node = Integer.parseInt(input[0]);
            int neighbor = Integer.parseInt(input[1]);
            graph.get(node).add(neighbor);
            graph.get(neighbor).add(node);
        }

        visited = new boolean[N + 1];
        dfs(V);
        bw.write("\n");
        visited = new boolean[N + 1];
        bfs(V);
        bw.write("\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
