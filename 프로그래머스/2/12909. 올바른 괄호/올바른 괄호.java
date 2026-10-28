import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            Character c = ' ';
            if(!st.empty()){
                c = st.peek();
            }
            if(c =='(' && s.charAt(i) == ')') {
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        if(st.size() > 0) {
            return false;
        }

        return answer;
    }
}