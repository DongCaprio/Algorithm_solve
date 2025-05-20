import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer;

        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int x : arr) {
            if (!st.isEmpty() && st.peek() == x) {
                continue;
            }
            st.add(x);
        }
        answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}
