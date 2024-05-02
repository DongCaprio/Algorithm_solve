import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int leftMax =0, rightMax =0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            leftMax = Math.max(leftMax, sizes[i][0]);
            rightMax = Math.max(rightMax, sizes[i][1]);
        }
        return leftMax*rightMax;
    }
}