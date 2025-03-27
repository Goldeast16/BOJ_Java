package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N16546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> runners = new ArrayList<Integer>();
        for (int i = 1; i <= N; i++) {
            runners.add(i);
        }
        // System.out.println(runners.toString());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int stLength = st.countTokens();

        for (int i = 0; i < stLength; i++) {
            runners.remove(Integer.valueOf(Integer.parseInt(st.nextToken())));
            // System.out.println(runners.toString());
        }

        System.out.println(runners.get(0));
    }
}
