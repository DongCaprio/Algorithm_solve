import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        if(s.charAt(0) == ')') return false;
        else st.push(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '(') st.push(s.charAt(i));
            else if(!st.empty() && s.charAt(i) == ')' && st.peek() == '(') st.pop();
            else return false;
        }
        if(!st.isEmpty()) return false;
        return answer;
    }
}