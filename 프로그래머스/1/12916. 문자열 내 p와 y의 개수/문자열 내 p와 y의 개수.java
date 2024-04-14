import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        for(char x : s.toCharArray()){
            if(x == 'p') pcount++;
            else if(x == 'y') ycount++;
        }
        if(pcount != ycount) answer = false;

        return answer;
    }
}