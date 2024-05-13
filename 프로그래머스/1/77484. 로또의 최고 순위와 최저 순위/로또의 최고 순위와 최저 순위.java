import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        ArrayList<Integer> win_list = new ArrayList<Integer>();
        for(int x : win_nums) {
        	win_list.add(x);
        }
        int max = 0;
        int min = 0;
        for(int x : lottos) {
        	if(x == 0 || win_list.contains(x)) max++;
        	if(win_list.contains(x)) min++;
        }
        
       answer[0] = getGrade(max);
       answer[1] = getGrade(min);
        
        return answer;
    }
    
    public int getGrade(int score) {
    	 if(score >1) {
         	return 7-score;
         }else {
        	 return 6;
         }
    }
}