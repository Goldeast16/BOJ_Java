package bronze.bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String Num = br.readLine();
        int N = Integer.parseInt(Num);

        while (N != 0) {
            StringBuilder isP = new StringBuilder();
            for (int i = Num.length() - 1; i >= 0; i--) {
                char n = Num.charAt(i);
                isP.append(n);
            }

            if (isP.toString().equals(Num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            Num = br.readLine();
            N = Integer.parseInt(Num);
        }
    }
}
