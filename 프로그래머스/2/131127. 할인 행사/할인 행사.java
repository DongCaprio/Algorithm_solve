import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<discount.length; i++){
            if(i<9){
                map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
            }else{
                map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
                boolean flag = true;
                for(int j=0; j<want.length; j++){
                    if(number[j] != map.getOrDefault(want[j],0)){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
                map.put(discount[i-9], map.getOrDefault(discount[i-9], 0)-1);
            }
        }
        return answer;
    }
}