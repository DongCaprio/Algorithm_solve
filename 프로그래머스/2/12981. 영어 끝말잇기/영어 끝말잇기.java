import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        String word = words[0];
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (word.charAt(word.length() - 1) != words[i].charAt(0)) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;
            }

            if (set.contains(words[i])) {
                System.out.println(word +" > word");
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;
            }

            word = words[i];
            set.add(words[i]);
        }

        return answer;
    }
}