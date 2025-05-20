import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = -1;

        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.add(c);
            }
        }
        if (st.isEmpty()) {
            return 1;
        }

        return 0;
    }
}
