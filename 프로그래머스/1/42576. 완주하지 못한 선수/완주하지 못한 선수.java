import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(String x : completion){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(String x : participant){
            if(map.getOrDefault(x,0) == 0) return x;
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }
}