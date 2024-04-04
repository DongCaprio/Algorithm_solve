class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n/a > 0){
            int mok = n/a;
            int na = n%a;
            
            answer+=(mok*b);
            n = mok*b+na; 
        }
        return answer;
    }
}