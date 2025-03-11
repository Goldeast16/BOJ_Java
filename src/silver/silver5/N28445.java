package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N28445 {

    public static void main(String[] args) throws IOException {
        String[] parents = new String[4];
        String[][] children = new String[16][2];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer father = new StringTokenizer(br.readLine());
        parents[0] = father.nextToken();
        parents[1] = father.nextToken();
        StringTokenizer mother = new StringTokenizer(br.readLine());
        parents[2] = mother.nextToken();
        parents[3] = mother.nextToken();

        String[] sortedParents= Arrays.stream(parents).
                distinct().
                sorted().
                toArray(String[]::new);

        int howManyColors = sortedParents.length;

        for (int i = 0; i < howManyColors; i++) {
            for (int j = 0; j < howManyColors; j++) {
                children[howManyColors*i+j][0] = sortedParents[i];
                children[howManyColors*i+j][1] = sortedParents[j];
            }
        }

        for (String[] child : children) {
            if (child[0] == null) {
                break;
            }
            System.out.print(child[0] + " ");
            System.out.println(child[1]);
        }
    }
}
