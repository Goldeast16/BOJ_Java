package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class N2606 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    
    public static void dfs (int node) {
        visited[node] = true;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs (int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < L; i++) {
            String[] input = br.readLine().split(" ");
            int node =  Integer.parseInt(input[0]);
            int neighbor = Integer.parseInt(input[1]);
            graph.get(node).add(neighbor);
            graph.get(neighbor).add(node);
        }

        visited = new boolean[N+1];
        dfs(1);

        int count = -1;
        for (boolean b : visited) {
            if (b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
