import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int[] answer = new int[arr.length-1];
        int min = Arrays.stream(arr).min().getAsInt();
        int j = 0;
        for(int x : arr){
            if(x == min) continue;
            answer[j++] = x;
        }
        
        return answer;
    }
}