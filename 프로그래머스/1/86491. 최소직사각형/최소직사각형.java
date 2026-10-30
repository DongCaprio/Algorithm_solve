import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
            
        
        for(int[] a : sizes) {
            int width = a[0];
            int height = a[1];
            
            int rw = Math.max(width, height);
            int rh = Math.min(width, height);
            
            w = Math.max(rw, w);
            h = Math.max(rh, h);
        }
        
        
        return w*h;
    }
}