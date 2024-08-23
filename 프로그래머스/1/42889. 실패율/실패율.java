import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지에 몇명 있는지 구한다.
        int[] challenger = new int[N +2];
        for(int i=0; i<stages.length; i++){
            challenger[stages[i]] ++;
        }
        // 스테이지별 실패율을 구한다.
        HashMap<Integer, Double> map = new HashMap<>();
        double count = stages.length;
        for(int i=1; i<=N; i++){
            if(challenger[i] == 0){
                map.put(i, (double) 0);
            }else{
                map.put(i, challenger[i]/count);
                count -= challenger[i];
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        return list.stream().mapToInt(i -> i).toArray();
    }
}