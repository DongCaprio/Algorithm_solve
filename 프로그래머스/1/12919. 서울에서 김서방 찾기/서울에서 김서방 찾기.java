class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int n = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                n = i;
                break;
            }
        }
        return answer+n+"에 있다";
    }
}