import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
    	int n = prices.length;
        int[] answer = new int[n];
        
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++) {
        	while(!st.isEmpty() &&  prices[i] < prices[st.peek()])  {
        		int j = st.pop();
        		answer[j] = i - j;
        	}
        	st.push(i);
        }
        while (!st.isEmpty()) {
            int j = st.pop();
            answer[j] = n - 1 - j;
          }
        
        return answer;
    }
}