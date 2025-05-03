package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class N1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (!Arrays.asList(arr).contains(input)) {
                arr[i] = input;
            } else {
                arr[i] = "0";
            }
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            if (!arr[i].equals("0")) {
                System.out.println(arr[i]);
            }
        }
    }
}
