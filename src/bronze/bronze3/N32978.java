package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class N32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer gradients = new StringTokenizer(br.readLine());
        List<String> tokensList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tokensList.add(gradients.nextToken());
        }

        StringTokenizer used = new StringTokenizer(br.readLine());
        while (used.hasMoreTokens()) {
            String use = used.nextToken();
            tokensList.remove(use);
        }

        for (String s : tokensList) {
            System.out.println(s);
        }
    }

}


