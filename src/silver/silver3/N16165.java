package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class N16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> memberToGroup = new HashMap<String, String>();
        HashMap<String, String[]> groupToMember = new HashMap<String, String[]>();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String groupName;
        String memberName;
        int members;

        for (int i = 0; i < N; i++) {
            groupName = br.readLine();
            members = Integer.parseInt(br.readLine());
            String[] membersArray = new String[members];

            for (int j = 0; j < members; j++) {
                memberName = br.readLine();
                memberToGroup.put(memberName, groupName);
                membersArray[j] = memberName;
            }
            Arrays.sort(membersArray);
            groupToMember.put(groupName, membersArray);
        }

        for (int i = 0; i < M; i++) {
            String quiz = br.readLine();
            int quizSort = Integer.parseInt(br.readLine());
            if (quizSort == 0) {
                for (String member : groupToMember.get(quiz)) {
                    System.out.println(member);
                }
            } else if (quizSort == 1) {
                System.out.println(memberToGroup.get(quiz));
            }
        }
    }
}
