import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
    	char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<arr.length; i++) {
        	if(set.contains(arr[i])) {
        		int size = 0;
        		for(int j=i-1; j>=0; j--) {
        			size++;
        			if(arr[j] == arr[i]) {
        				answer[i] = size;
        				break;
        			}
        		}
        	}else {
        		set.add(arr[i]);
        		answer[i] = -1;
        	}
        }
        return answer;
    }
}