import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int ceil = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            System.out.println(ceil);
            q.offer(ceil);
        }

        while (!q.isEmpty()) {
            int n = 1;
            int poll = q.poll();
            while (!q.isEmpty() && q.peek() <= poll) {
                q.poll();
                n++;
            }
            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
