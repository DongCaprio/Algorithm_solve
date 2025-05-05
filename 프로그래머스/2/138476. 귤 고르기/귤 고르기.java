import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int j : tangerine) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        values.sort(Collections.reverseOrder());

        int answer = 0;
        int sum = 0;
        for (int value : values) {
            sum += value;
            answer++;
            if (sum >= k) {
                return answer;
            }
        }

        return answer;
    }
}
