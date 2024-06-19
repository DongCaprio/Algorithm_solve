import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int round = 0;
        char lastWord = words[0].charAt(0);
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            if(i%n==0) round++;
            if(set.contains(words[i]) || words[i].charAt(0) != lastWord){ //끝
                int num = i%n + 1;
                answer = new int[]{num, round};
                break;
            }else{
                set.add(words[i]);
                lastWord = words[i].charAt(words[i].length()-1);
            }
        }
        return answer;
    }
}