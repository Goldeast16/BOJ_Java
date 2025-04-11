package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _N9253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String check = br.readLine();

        if (checkTrue(A, B, check)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkTrue(String A, String B, String check) {
        int ind = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == check.charAt(ind)) {
                ind++;
            } else {
                ind = 0;
            }
            if (ind == check.length()) {
                break;
            }
        }
        if (ind != check.length()) {
            return false;
        }
        ind = 0;
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == check.charAt(ind)) {
                ind++;
            } else {
                ind = 0;
            }
            if (ind == check.length()) {
                break;
            }
        }
        if (ind != check.length()) {
            return false;
        }
        return true;
    }
}
