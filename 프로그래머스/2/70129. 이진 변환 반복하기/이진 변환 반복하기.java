class Solution {
	
	int round =0, remove = 0;
	
    public int[] solution(String s) {
    	while(!"1".equals(s)) {
    		s = change1(s);
    		s = change2(s);
    		round++;
    	}
    	int[] answer = {round, remove};
        return answer;
    }
    
    public String change1(String s) {
    	StringBuilder sb = new StringBuilder();
    	for(char x : s.toCharArray()) {
    		if(x == '1') sb.append('1');
    		else remove++;
    	}
    	return sb.toString();
    }
    
    public String change2(String s) {
    	int length = s.length();
    	return Integer.toBinaryString(length);
    }
    
}