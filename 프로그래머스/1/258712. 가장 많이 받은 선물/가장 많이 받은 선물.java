import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<friends.length; i++){
            map.put(friends[i], i);
        }
        int[] index = new int[friends.length];
        int[][] recode = new int[friends.length][friends.length];

        for(String str : gifts){
            String[] cur = str.split(" ");
            index[map.get(cur[0])]++;
            index[map.get(cur[1])]--;
            recode[map.get(cur[0])][map.get(cur[1])]++;
        }

        int ans = 0;
        for(int i=0; i<friends.length; i++){
            int cnt = 0;
            for(int j=0; j<friends.length; j++){
                if(i==j) continue;
                else if(recode[i][j] > recode[j][i] || (recode[i][j] == recode[j][i] && index[i] > index[j])) cnt++;
            }
            ans =Math.max(ans, cnt);
        }
        return ans;
    }
}