class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        
        for(int width=3; width<= total; width++) {
        	if(total % width != 0) continue;
        	int height = total  / width ;
        	if(height > width) continue;
        	
        	int inside_area = (width-2)*(height-2);
        	if(inside_area == yellow) {
        		answer = new int[]{width, height};
        		break;
        	}
        }
        return answer;
    }
}