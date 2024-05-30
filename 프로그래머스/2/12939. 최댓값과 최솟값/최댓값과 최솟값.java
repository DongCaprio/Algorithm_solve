import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max = 0, min = 0;
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        max = Arrays.stream(intArr).max().getAsInt();
        min = Arrays.stream(intArr).min().getAsInt();
        
        
        return answer+min+" "+max;
    }
}