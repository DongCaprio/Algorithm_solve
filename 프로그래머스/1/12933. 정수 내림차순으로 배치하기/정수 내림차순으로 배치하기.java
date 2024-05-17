import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        while(n>0){
            long m = n%10;
            list.add(m);
            n = n/10;
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Long l : list){
            sb.append(l);
        }
        String str = sb.toString();
        answer = Long.parseLong(str);
        return answer;
    }
}