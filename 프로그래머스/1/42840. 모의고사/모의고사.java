import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	int correct = answers[i];
        	if(correct == answer1[i%answer1.length]) {
        		count1++;
        	}
        	if(correct == answer2[i%answer2.length]) {
        		count2++;
        	}
        	if(correct == answer3[i%answer3.length]) {
        		count3++;
        	}
        }
        
        int highestScore = Math.max(Math.max(count1, count2), count3);
        List<Integer> highestScoringStudents = new ArrayList<>();
        if (count1 == highestScore) {
            highestScoringStudents.add(1);
        }
        if (count2 == highestScore) {
            highestScoringStudents.add(2);
        }
        if (count3 == highestScore) {
            highestScoringStudents.add(3);
        }
        
        answer = highestScoringStudents.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}