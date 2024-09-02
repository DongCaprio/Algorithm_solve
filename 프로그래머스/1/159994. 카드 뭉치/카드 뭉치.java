import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Deque<String> d1 = new ArrayDeque<>();
        Deque<String> d2 = new ArrayDeque<>();
        for(String x : cards1) d1.add(x);
        for(String x : cards2) d2.add(x);

        for(String x : goal){
            if(!d1.isEmpty() && d1.peek().equals(x)){
                d1.remove();
            }else if(!d2.isEmpty() &&d2.peek().equals(x)){
                d2.remove();

            }else{
                return "No";
            }
        }

        return answer;
    }
}