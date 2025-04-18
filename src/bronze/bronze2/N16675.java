package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N16675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(checkWinner(input));
    }

    public static String checkWinner(String[] input) {
        if ((input[0].equals("R") && input[1].equals("R")) && (input[2].equals("P") || input[3].equals("P"))) {
            return "TK";
        }
        if ((input[0].equals("S") && input[1].equals("S")) && (input[2].equals("R") || input[3].equals("R"))) {
            return "TK";
        }
        if ((input[0].equals("P") && input[1].equals("P")) && (input[2].equals("S") || input[3].equals("S"))) {
            return "TK";
        }
        if ((input[0].equals("R") || input[1].equals("R")) && (input[2].equals("S") && input[3].equals("S"))) {
            return "MS";
        }
        if ((input[0].equals("S") || input[1].equals("S")) && (input[2].equals("P") && input[3].equals("P"))) {
            return "MS";
        }
        if ((input[0].equals("P") || input[1].equals("P")) && (input[2].equals("R") && input[3].equals("R"))) {
            return "MS";
        }

        return "?";
    }
}
