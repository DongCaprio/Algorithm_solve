import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        s += s;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Loop1 : for(int i=0; i<size; i++) {
            Stack<Character> st = new Stack<>();
            Loop2 : for(int j=i; j<i+size; j++) {
                if(map.get(s.charAt(j)) == null) {
                    st.add(s.charAt(j));
                }else {
                    if(st.isEmpty() || !st.pop().equals(map.get(s.charAt(j)))) {
                        continue Loop1;
                    }
                }
            }
            if(st.isEmpty()) answer++;
        }
        return answer;
    }
}