class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int sumPrice = price;
        for(int i=0; i<count; i++) {
        	answer += sumPrice;
        	sumPrice += price;
        }
        long a = money-answer;
        if(a<0) return a*-1;
        else return 0;
    }
}