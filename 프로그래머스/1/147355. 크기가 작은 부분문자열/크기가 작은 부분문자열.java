class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i+(p.length())-1<t.length(); i++){
            String x = "";
            for(int j=0; j<p.length(); j++){
                x += t.charAt(i+j);
            }
            if(Long.parseLong(x) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}