package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class N27111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        CheckList checkList = new CheckList();
        int result = 0;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int who = Integer.parseInt(input[0]);
            int isIn = Integer.parseInt(input[1]);
            checkList.serving(who, isIn);
        }
        checkList.checkRemain();
        result = checkList.getMissed();
        System.out.println(result);
    }
}

class CheckList {
    private Set<Integer> numbers = new HashSet<>();
    private int missed = 0;
    private boolean result;

    void serving(int who, int isIn) {
        if (isIn == 1) {
            result = this.add(who);
        }
        else {
            result = this.out(who);
        }
        if (!result) {
            missed++;
        }
        // System.out.println(this.getMissed());
    }

    boolean add(int who) {
        if (numbers.contains(who)) {
            // System.out.println(who + " is already in the list");
            return false;
        }
        numbers.add(who);
        // System.out.println(who + "가 입장");
        return true;
    }

    boolean out(int who) {
        if (!numbers.contains(who)) {
            // System.out.println(who + " is not in the list");
            return false;
        }
        numbers.remove(who);
        // System.out.println(who + "가 퇴장");
        return true;
    }

    void checkRemain() {
        for (Integer number : numbers) {
            // System.out.println(number + "가 아직 퇴장하지 않음");
            missed++;
            // System.out.println(this.getMissed());
        }
    }

    int getMissed() {
        return missed;
    }

}
