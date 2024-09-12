import java.util.HashMap;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i=0; i<enroll.length; i++) {
        	map.put(enroll[i], referral[i]);
        }
        
        HashMap<String, Integer> moneyMap = new HashMap<String, Integer>();
        for(int i=0; i<seller.length; i++) {
        	int money = amount[i] * 90 ;
        	int topmoney = amount[i] * 10 ;
        	moneyMap.put(seller[i], moneyMap.getOrDefault(seller[i], 0) + money);
        	
        	String topName = map.get(seller[i]);
        	while(!topName.equals("-") && topmoney >=1) {
        		int mmoney = topmoney / 10;
        		int mymoney = topmoney - mmoney;
        		moneyMap.put(topName, moneyMap.getOrDefault(topName, 0) + mymoney);
        		topmoney = mmoney;
        		topName = map.get(topName);
        	}
        }
        
		for(int i=0; i<answer.length; i++) {
			answer[i] = moneyMap.getOrDefault(enroll[i], 0); 
		}
        return answer;
    }
}