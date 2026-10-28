import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        int now = 0;
        
         while(now < progresses.length) {     
            int count = 0;
            for(int i=0; i<progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            if(progresses[now] >= 100) {
                for(; now < progresses.length; now++) {
                    if(progresses[now] < 100) {
                        break;
                    }
                    count++;
                }
                list.add(count);
            }
        }
        
        int[] answer = new int[list.size()];   
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}