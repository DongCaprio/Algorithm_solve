class Solution {
    public int[] solution(String[] park, String[] routes) {

    	int[][] miro = new int[park.length][park[0].length()];
        int x =0, y =0;
        
        for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[0].length(); j++) {
        		if(park[i].charAt(j) == 'S') {
        			y = i;
        			x = j;
        		}else if(park[i].charAt(j) == 'X') {
        			miro[i][j] = 1;
        		}
        	}
        }
        
        for(String str : routes) {
        	String[] arr = str.split(" ");
        	int fx = x, fy = y;
        	boolean breakYN = false;
			if("E".equals(arr[0])) {
				for(int i=0; i<Integer.parseInt(arr[1]); i++) {
					fx++;
					if(fx >= miro[0].length || miro[fy][fx] == 1) {
						breakYN = true;
						break;
					}
				}
				if(!breakYN) x = fx;
			}else if("W".equals(arr[0])) {
				for(int i=0; i<Integer.parseInt(arr[1]); i++) {
					fx--;
					if(fx < 0 || miro[fy][fx] == 1) {
						breakYN = true;
						break;
					}
				}
				if(!breakYN) x = fx;
			}else if("S".equals(arr[0])) {
				for(int i=0; i<Integer.parseInt(arr[1]); i++) {
					fy++;
					if(fy >= miro.length || miro[fy][fx] == 1) {
						breakYN = true;
						break;
					}
				}
				if(!breakYN) y = fy;
			}else if("N".equals(arr[0])) {
				for(int i=0; i<Integer.parseInt(arr[1]); i++) {
					fy --;
					if(fy < 0 || miro[fy][fx] == 1) {
						breakYN = true;
						break;
					}
				}
				if(!breakYN) y = fy;
			}
        }
        
        int[] answer = {y ,x};
        return answer;
    }
}