package ibm_exercises;

import java.util.*;

public class MaxStrength {
    static final int MAX_TEAM_SIZE = 10;

    private static int getFactorial(int n) {
        int i = n - 1;
        while (i > 1) {
            n *= i;
            i--;
        }
        return n;
    }

    private static int findFactorial(int n) {
        if (n <= 9) {
            n = getFactorial(n);
            return n;
        } else {
            String text = Integer.toString(n);
            String[] numArr = text.split("", 0);
            int res = 0;
            for (String item : numArr) {
                int num = Integer.parseInt(item);
                if (num != 0) {
                    num = getFactorial(num);
                    res += num;
                } else {
                    res += 1;
                }
            }
            return res;
        }
    }

    private static List<Integer> mountTeam(int n) {
        ArrayList<Integer> team = new ArrayList<Integer>(Arrays.asList(n));
        for (int i = 1; i < MAX_TEAM_SIZE; i++) {
            team.add(findFactorial(team.get(i - 1)));
        }
        return team;
    }

    private static int findLeader(List<Integer> list) {
        int leader = -1;
        for (int item : list) {
            if (item > leader) {
                leader = item;
            }
        }
        return leader;
    }

    static long getMaxStrength(int initialValue) {
        List<Integer> team = mountTeam(initialValue);
        int leader = findLeader(team);
        return leader * team.size();
    }
}
