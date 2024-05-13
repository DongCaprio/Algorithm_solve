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
        
        switch (max) {
        case 6:
            answer[0] = 1;
            break;
        case 5:
        	answer[0] = 2;
            break;
        case 4:
        	answer[0] = 3;
            break;
        case 3:
        	answer[0] = 4;
            break;
        case 2:
        	answer[0] = 5;
            break;
        default:
        	answer[0] = 6;
            break;
        }
        switch (min) {
        case 6:
        	answer[1] = 1;
        	break;
        case 5:
        	answer[1] = 2;
        	break;
        case 4:
        	answer[1] = 3;
        	break;
        case 3:
        	answer[1] = 4;
        	break;
        case 2:
        	answer[1] = 5;
        	break;
        default:
        	answer[1] = 6;
        	break;
        }
        return answer;
    }
}