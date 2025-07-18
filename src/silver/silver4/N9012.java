package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int stack = 0;

        for  (int i = 0; i < N; i++) {
            String input =  br.readLine();
            for(int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == '(') {
                    stack++;
                } else if(input.charAt(j) == ')') {
                    stack--;
                }
                if (stack < 0) {
                    break;
                }
            }

            if (stack == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack = 0;
        }

    }
}
