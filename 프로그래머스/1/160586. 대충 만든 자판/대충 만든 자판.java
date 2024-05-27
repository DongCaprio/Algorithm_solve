import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for(String str : keymap) {
        	for(int i=0; i<str.length(); i++) {
        		char x = str.charAt(i);
        		int count = map.getOrDefault(x, i+1);
        		map.put(x, Math.min(count, i+1));
        	}
        }
        
        for(int i=0; i<targets.length; i++) {
        	String key = targets[i];
        	int count = 0;
        	for(int j=0; j<key.length(); j++) {
        		if(map.containsKey(key.charAt(j))) {
        			count += map.get(key.charAt(j));
        		}else {
        			count = -1;
        			break;
        		}
        	}
        	answer[i] = count;
        }
        
        return answer;
    }
}