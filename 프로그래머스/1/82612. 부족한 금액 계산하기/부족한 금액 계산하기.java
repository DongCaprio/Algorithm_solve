class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int sumPrice = price;
        for(int i=0; i<count; i++) {
        	answer += sumPrice;
        	sumPrice += price;
        }
        return Math.max((money-answer)*-1, 0);
    }
}