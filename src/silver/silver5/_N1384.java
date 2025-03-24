package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _N1384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int N = Integer.parseInt(br.readLine());
        while (N != 0) {
            Paper[] members = new Paper[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String[] messages = new String[N-1];

                for (int k = 0; k < N-1; k++) {
                    messages[k] = st.nextToken();
                }
                members[i] = new Paper(name, messages);
            }

            boolean nasty = false;
            System.out.println("Group " + count);
            for (int i = 0; i < N; i++) {
                String[] messages = members[i].messages;
                for (int j = 0; j < N-1; j++) {
                    if (messages[j].equals("N")) {
                        nasty = true;
                        int ind;
                        if (i - j < 0) {
                            ind = 4 + (i - j);
                        } else {
                            ind = i - j - 1;
                        }
                        System.out.println(members[ind].name + " was nasty about " + members[i].name);
                    }
                }
            }
            if (nasty == false) {
                System.out.println("Nobody was nasty");
            }
            count++;
            System.out.println();
            N = Integer.parseInt(br.readLine());
        }


    }
}

class Paper {

    String name;
    String[] messages;

    Paper (String name, String[] messages) {
        this.name = name;
        this.messages = messages;
    }
}