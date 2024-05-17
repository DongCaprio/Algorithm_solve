class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(three);
        three = sb.reverse().toString();
        String ten = Integer.toString(Integer.parseInt(three,3));
        answer = Integer.parseInt(ten);
        
        return answer;
    }
}