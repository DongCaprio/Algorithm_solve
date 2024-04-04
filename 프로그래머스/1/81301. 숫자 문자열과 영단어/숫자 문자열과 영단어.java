import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        char[] arr = s.toCharArray();
        String answer2 = "";
        String tmp = "";
        
        for(int i=0; i<arr.length; i++){
            if(Character.isDigit(arr[i])) answer2 += arr[i];
            else tmp += arr[i];
                        
            if(map.get(tmp) != null){
                answer2 += map.get(tmp);
                tmp = "";
            }
        }
        
        answer = Integer.parseInt(answer2);
        
        
        
        
        
        return answer;
    }
}