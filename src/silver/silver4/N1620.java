package silver.silver4;

import java.io.*;
import java.util.HashMap;

public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input =  br.readLine().split(" ");
        int N =  Integer.parseInt(input[0]);
        int M =  Integer.parseInt(input[1]);

        PMonCollection newDogam= new PMonCollection();
        newDogam.insertCollection(N, br);
        newDogam.test(M, br);
    }
}

class PMonCollection {
    private HashMap<String, Integer> name2num = new HashMap<>();
    private String[] num2name;

    PMonCollection() {}

    public void insertCollection (int N, BufferedReader br) throws IOException {
        num2name = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            num2name[i] = name;
            name2num.put(name, i);
        }
    }

    public void test (int M, BufferedReader br) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for  (int i = 1; i <= M; i++) {
            String input = br.readLine();
            if (input.matches("[a-zA-Z]+")) {
                bw.write(String.valueOf(name2num.get(input)) + '\n');
            } else {
                bw.write(num2name[Integer.parseInt(input)] + '\n');
            }
        }
        bw.flush();
    }
}
