class Solution {
    public int solution(int n) {
        int answer = n+1;
        String str = Integer.toBinaryString(n);
        int count1 = 0;
        int count2 = 0;
        for(char c : str.toCharArray()) {
        	if(c == '1') count1++;
        }
        while(true) {
        	String str2 = Integer.toBinaryString(answer);
        	for(char c : str2.toCharArray()) {
            	if(c == '1') count2++;
            }
        	if(count2 == count1) break;
        	count2 = 0;
        	answer++;
        }
		return answer;
	}
}