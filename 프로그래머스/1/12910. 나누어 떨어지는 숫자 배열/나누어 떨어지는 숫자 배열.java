import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            if(x%divisor==0) list.add(x);
        }
        if(list.isEmpty()) answer = new int[]{-1};
        else{
            answer = new int[list.size()];
            int i=0;
            for(int a : list){
                answer[i++] = a;
            }
        }
        return answer;
    }
}