import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int top : topping) {
            if (map1.get(top) == null) {
                map1.put(top, 1);
            } else {
                map1.put(top, map1.get(top) + 1);
            }
        }

        for (int top : topping) {
            map2.put(top, map2.getOrDefault(top, 0) + 1);
            map1.put(top, map1.getOrDefault(top, 0) - 1);
            
            if (map1.getOrDefault(top, 0) == 0) {
                map1.remove(top);
            }

            if (map1.size() == map2.size()) {
                answer++;
            }

        }


        return answer;
    }
}
