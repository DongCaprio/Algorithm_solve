import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int getnums = nums.length/2;
        Set<Integer> set = new HashSet<Integer>();
        for(int x : nums) {
        	set.add(x);
        }
        if(set.size() < getnums) {
        	answer = set.size();
        }else {
        	answer = getnums;
        }
        return answer;
    }
}