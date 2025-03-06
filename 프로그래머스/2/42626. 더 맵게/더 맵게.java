import java.util.Arrays;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        Arrays.stream(scoville).boxed().forEach(pQ::add);
        if (pQ.peek() >= K) {
            return 0;
        }
        
        while (true) {
            answer++;
            int a = pQ.remove();
            int b = pQ.remove();
            int mix = a + (b * 2);
            pQ.add(mix);
            Integer peek = pQ.peek();
            if (peek >= K) {
                break;
            }
            if (pQ.size() == 1) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}