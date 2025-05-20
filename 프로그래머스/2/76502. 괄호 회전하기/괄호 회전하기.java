import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {

    Map<Character, Character> map = new HashMap<>();
    int answer = 0;

    public int solution(String s) {
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for (int i = 0; i < s.length(); i++) {
            check(s);
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    private void check(String s) {
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!st.isEmpty() && map.get(c) == st.peek()) {
                st.pop();
            } else {
                st.add(c);
            }
        }
        if (st.isEmpty()) {
            answer++;
        }
    }
}
