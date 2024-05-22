import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] sumArr = new int[N+1];
        int[] countArr = new int[N+1];
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        for(int i=0; i<stages.length; i++){
            int val = stages[i];
            if(val < countArr.length) {
        		countArr[val] = countArr[val]+1; 
        	}
            for(int j=1; j<=val; j++){
                if(j>N) continue;
                sumArr[j] = sumArr[j]+1;
            }
        }
        for(int i=1; i<N+1; i++) {
            if(sumArr[i] == 0) map.put(i, 0.0);
            else map.put(i, (double)countArr[i]/sumArr[i]);                     
        }
       
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        return list.stream().mapToInt(i -> i).toArray();
    }
}