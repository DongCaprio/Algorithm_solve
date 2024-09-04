import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        String in = "님이 들어왔습니다.";
        String out = "님이 나갔습니다.";
        HashMap<String, String> nameMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<record.length; i++) {
        	String[] arr = record[i].split(" ");
        	if(arr[0].equals("Enter")) {
        		nameMap.put(arr[1], arr[2]);
        		list.add(arr[1] + in);
        	}else if(arr[0].equals("Leave")) {
        		list.add(arr[1] + out);
        	}else if(arr[0].equals("Change")) {
        		nameMap.put(arr[1], arr[2]);
        	}
        }
        
        for(int i=0; i<list.size(); i++) {
        	String x = list.get(i);
        	int idx = x.indexOf("님이");
        	String id = x.substring(0, idx);
        	String newStr = nameMap.get(id) + x.substring(idx);
        	list.set(i, newStr);
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}