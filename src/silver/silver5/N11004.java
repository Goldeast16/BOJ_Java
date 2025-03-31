package silver.silver5;

import java.io.*;
import java.util.ArrayList;

public class N11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndK = br.readLine().split(" ");
        int N = Integer.parseInt(nAndK[0]);
        int K = Integer.parseInt(nAndK[1]);

        String[] list = br.readLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(Integer.parseInt(s));
        }
        numbers.sort(Integer::compareTo);
        System.out.println(numbers.get(K-1));
    }
}
