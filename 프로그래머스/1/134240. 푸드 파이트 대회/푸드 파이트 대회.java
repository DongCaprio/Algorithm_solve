class Solution {
    public String solution(int[] food) {
        StringBuffer sb1 = new StringBuffer();
        
        for(int i=1; i<food.length; i++) {
        	if(food[i]%2 == 1) food[i] -= 1;
        	for(int j=0; j<food[i]/2; j++) {
    			sb1.append(i);
    		}
        }
        String answer = sb1.toString();
        return answer + "0" + new StringBuffer(answer).reverse().toString();
    }
}