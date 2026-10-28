import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i : arr) {
            if(st.size() > 0 && i == st.peek()) {
                continue;
            }
            st.push(i);
            list.add(i);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}