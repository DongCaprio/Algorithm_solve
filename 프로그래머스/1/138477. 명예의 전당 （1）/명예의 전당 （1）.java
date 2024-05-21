import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            Collections.sort(list);
            if(k<=i) list.remove(0);
            answer[i] = list.get(0);
        }
        return answer;
    }
}