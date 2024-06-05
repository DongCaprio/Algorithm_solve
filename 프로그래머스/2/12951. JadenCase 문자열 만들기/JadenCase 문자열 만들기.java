class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean changeYN = true;
        
        for(int i=0; i<s.length(); i++) {
        	if(changeYN && s.charAt(i) != ' ') {
        		sb.append(Character.toUpperCase(s.charAt(i)));
        		changeYN = false;
        	}else {
        		sb.append(Character.toLowerCase(s.charAt(i)));
        		if(s.charAt(i) == ' ') changeYN = true; 
        	}
        }
        return sb.toString();
    }
}