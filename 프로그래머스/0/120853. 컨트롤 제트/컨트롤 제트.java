import java.util.Stack;

class Solution {
    public int solution(String s) {
        String[] split = s.split(" ");
        Stack<Integer> st = new Stack<>();
        for (String x : split) {
            if (x.equals("Z") && !st.isEmpty()) {
                st.pop();
            } else {
                st.add(Integer.parseInt(x));
            }
        }
        return st.stream().mapToInt(i -> i).sum();
    }
}
