import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
        	String x = s.substring(1, s.length()) + s.charAt(0);
        	s = x;
        	st.clear();
        	for(int j=0; j<s.length(); j++) {
        			if(st.size() > 0) {
        				char c = st.peek();
        				if(c == '(' && s.charAt(j) == ')') st.pop();
        				else if(c == '[' && s.charAt(j) == ']') st.pop();
        				else if(c == '{' && s.charAt(j) == '}') st.pop();
        				else st.push(s.charAt(j));
        			}else {
        				st.push(s.charAt(j));
        			}
        	}
        	if(st.size() == 0) answer++;
        }
        return answer;
    }
}