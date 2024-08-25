import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') st.push('(');
            else{
                if(!st.isEmpty() && st.peek()== '(') st.pop();
                else st.push(')');
            }
        }
        
        if(!st.isEmpty()) answer = false;

        return answer;
    }
}