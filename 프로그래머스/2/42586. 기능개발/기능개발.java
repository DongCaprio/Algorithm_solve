import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int idx = 0;
        
        while(idx<progresses.length) {
        	for(int i=idx; i<progresses.length; i++) {
        		int val = progresses[i];
        		int plus = speeds[i];
        		progresses[i] = val + plus;
        	}
        	if(progresses[idx]>=100) {
        		int count = 0;
        		for(int i=idx; i<progresses.length; i++) {
        			if(progresses[i]<100) {
        				break;
        			}else {
        				count++;
        			}
        		}
        		list.add(count);
        		idx+=count;
        	}
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}