import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        ArrayList<Integer> leftList = new ArrayList<>(Arrays.asList(1, 4,7));
        ArrayList<Integer> rightList = new ArrayList<>(Arrays.asList(3, 6, 9));
        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12;
        
        for(int x : numbers) {
        	if(leftList.contains(x)) {
        		sb.append("L");
        		left = x;
        	}else if(rightList.contains(x)) {
        		sb.append("R");
        		right = x;
        	}else {
        		if(x == 0) x = 11;
        		
        		int leftLength = Math.abs(x-left)/3 + Math.abs(x-left)%3; 
        		int rightLength = Math.abs(x-right)/3 + Math.abs(x-right)%3; 
        		
        		if(leftLength > rightLength) {
        			sb.append("R");
        			right = x;
        		}else if(leftLength < rightLength) {
        			sb.append("L");
        			left = x;
        		}else {
        			if("left".equals(hand)) {
        				sb.append("L");
            			left = x;
        			}else {
        				sb.append("R");
            			right = x;
        			}
        		}
        	}
        }
        return sb.toString();
    }
}