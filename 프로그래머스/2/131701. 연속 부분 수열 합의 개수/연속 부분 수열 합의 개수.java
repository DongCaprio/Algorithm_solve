import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<Integer>();
        int[] newEleArr = new int[elements.length + elements.length-2];
        for(int i=0, j =0; i<newEleArr.length; i++) {
        	if(i < elements.length) {
        		newEleArr[i] = elements[i];
        	}else {
        		newEleArr[i] = elements[j++];
        	}
        }
        
        for(int i=0; i<elements.length; i++) {
        	int a = newEleArr[i];
        	set.add(a);
        	for(int j=i+1; j<=i+elements.length-1 && j< newEleArr.length ; j++) {
        		a += newEleArr[j];
        		set.add(a);
        	}
        }
        return set.size();
    }
}