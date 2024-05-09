import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 ||s.length() == 6){
            
        }else{
            return false;
        }
        
        try{
            int number = Integer.parseInt(s);
        }
        catch (NumberFormatException ex){
            answer =false;
        }
        
        return answer;
    }
}