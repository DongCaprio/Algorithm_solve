import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            int m = n%10;
            answer += m;
            n = n/10;
        }
        return answer;
    }
}