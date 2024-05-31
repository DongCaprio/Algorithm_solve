import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<survey.length; i++) {
        	int val = choices[i];
        	if(val >= 1 && val <=3) {
        		map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) - val + 4);
        	}else if(val >=5 && val <= 8) {
        		map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + val - 4); 
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        
        return sb
        .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
        .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
        .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
        .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
        .toString();
    }
}