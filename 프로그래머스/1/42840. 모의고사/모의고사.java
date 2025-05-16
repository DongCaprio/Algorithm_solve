import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < answers.length; i++) {
            int n1 = i % one.length;
            int n2 = i % two.length;
            int n3 = i % three.length;

            if (one[n1] == answers[i]) {
                c1++;
            }
            if (two[n2] == answers[i]) {
                c2++;
            }
            if (three[n3] == answers[i]) {
                c3++;
            }
        }
        int maxScore = Math.max(c1, Math.max(c2, c3));
        ArrayList<Integer> list = new ArrayList<>();

        if (c1 == maxScore) {
            list.add(1);
        }
        if (c2 == maxScore) {
            list.add(2);
        }
        if (c3 == maxScore) {
            list.add(3);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
