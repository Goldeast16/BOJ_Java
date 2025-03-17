package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N30503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer flowers = new StringTokenizer(br.readLine());
        int[] field = new int[N];
        for (int i = 0; i < N; i++) {
            field[i] = Integer.parseInt(flowers.nextToken());
        }
        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            StringTokenizer Query = new StringTokenizer(br.readLine());
            int isCheck = Integer.parseInt(Query.nextToken());
            int start = Integer.parseInt(Query.nextToken());
            int end = Integer.parseInt(Query.nextToken());
            if (isCheck == 1) {
                int species = Integer.parseInt(Query.nextToken());
                checkQuery(field, start, end, species);
            } else {
                field = deleteQuery(field, start, end);
            }
        }
    }

    public static int[] deleteQuery(int[] field, int start, int end) {
        for (int i = start - 1; i < end; i++) {
            field[i] = 0;
        }
        return field;
    }

    public static void checkQuery(int[] field, int start, int end, int species) {
        int count = 0;
        for (int i = start - 1; i < end; i++) {
            if (field[i] == species) {
                count++;
            }
        }
        System.out.println(count);
    }
}
