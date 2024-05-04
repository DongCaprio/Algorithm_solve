class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] names = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30};
        int day = 0;
        for(int i=0; i<a-1; i++){
            day += days[i];
        }
        day += (b);
        if((day%7)-3 >=0){
            answer = names[(day%7)-3];
        }else{
            answer = names[(day%7)+4];
        }
        return answer;
    }
}