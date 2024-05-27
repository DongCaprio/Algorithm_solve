import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x : ingredient) {
        	list.add(x);
        	if(list.size() >= 4) {
        		if(list.get(list.size()-1) == 1 &&
        				list.get(list.size()-2) == 3 &&
        				list.get(list.size()-3) == 2 &&
        				list.get(list.size()-4) == 1) {
        			answer++;
        			for(int i=0; i<4; i++) list.remove(list.size()-1);
        		}
        	}
        }
        return answer;
    }
}