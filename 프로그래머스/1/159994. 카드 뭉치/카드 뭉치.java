import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        for (String s : cards1) {
            q1.offer(s);
        }
        for (String s : cards2) {
            q2.offer(s);
        }

        for (String s : goal) {
            String s1 = null, s2 = null;
            if (s.equals(q1.peek())) {
                s1 = q1.poll();
            }
            if (s.equals(q2.peek())) {
                s2 = q2.poll();
            }
            if (s1 == null && s2 == null) {
                return "No";
            }
        }

        return "Yes";
    }
}
