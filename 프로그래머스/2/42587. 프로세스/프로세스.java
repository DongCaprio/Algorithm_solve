import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : priorities) Q.offer(x);

        while(!Q.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(Q.peek() == priorities[i]){
                    Q.poll();
                    answer++;
                    if(location == i) return answer;
                }
            }
        }
        return answer;
    }
}