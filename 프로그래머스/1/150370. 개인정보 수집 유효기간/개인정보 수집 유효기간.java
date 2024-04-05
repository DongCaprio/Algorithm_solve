import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        
        ArrayList<Integer> answerList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String x : terms) {
        	String[] arr = x.split(" ");
        	map.put(arr[0], Integer.parseInt(arr[1]));
        }
        
        for(int i=1; i<=privacies.length; i++) {
        	String[] arr = privacies[i-1].split(" ");
        	int month = map.get(arr[1]);
        	
        	LocalDate date = LocalDate.parse(arr[0], formatter);
        	LocalDate newDate = date.plusMonths(month).minusDays(1);
        	if(newDate.getDayOfMonth() >28) {
        		newDate = newDate.withDayOfMonth(28);
        	}
        	
        	int comp = LocalDate.parse(today, formatter).compareTo(newDate);
        	if(comp>0) {
        		answerList.add(i);
        	}
        }
        Collections.sort(answerList);
        answer =  answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}