class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
    	if(answer.charAt(0) == '.')  answer = answer.substring(1);
    	if(answer.length()>0) {
        	if(answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        }
        if("".equals(answer)) answer = "a";
        if(answer.length() >=16) answer = answer.substring(0, 15);
        if(answer.charAt(answer.length()-1) == '.') answer.substring(0, answer.length()-1);
        if(answer.length()<=2) {
        	while(answer.length() <3) {
        		answer += answer.charAt(answer.length()-1);
        	}
        }
        if(answer.length()>0) {
        	if(answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        }
        System.out.println(answer);
        return answer;
    }
}