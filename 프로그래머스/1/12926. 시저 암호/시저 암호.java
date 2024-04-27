import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' ') {
                answer += arr[i];
                continue;
            }
            int c = arr[i];
            int a = arr[i]+n;
            if((c >=65 && c<=90 && a>90) || (c >=97 && c<=122 && a>122)) a -=26;
            char b = (char)a;
            answer += b;
        }
        
        return answer;
    }
}