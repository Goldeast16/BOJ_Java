package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N23882 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringTokenizer arrayInput = new StringTokenizer(br.readLine().trim());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(arrayInput.nextToken());
        }

        array = selectionSort(array, K);

        if (array[0] == -1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print(array[i] + " ");
                } else {
                    System.out.print(array[i]);
                }
            }
        }
    }

    static int[] selectionSort(int[] array, int K) {
        int sortCount = 0;

        // while을 쓸 필요 없음. count가 다 됐을 때 반환하게 하면 됨.
        for (int i = 0; i < array.length; i++) { // 아예 초기값을 크게 잡고 i > 0; i-- 해도 됨
            int now = array.length - 1 - i;
            int max = array[0];
            int index = 0;
            for (int j = 0; j < now + 1; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            if (index != now) {
                int temp = array[now];
                array[now] = array[index];
                array[index] = temp;
                sortCount++;
                if (sortCount == K) {
                    return array;
                }
            }
        }
        return new int[] {-1};
    }
}
