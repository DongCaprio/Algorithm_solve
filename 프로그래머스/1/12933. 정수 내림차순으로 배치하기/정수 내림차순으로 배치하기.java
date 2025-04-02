import java.util.PriorityQueue;

class Solution {
    public long solution(long n) {
        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        String s = String.valueOf(n);
        for (char a : s.toCharArray()) {
            Q.offer(Character.getNumericValue(a));
        }
        StringBuilder sb = new StringBuilder();
        while (!Q.isEmpty()) {
            sb.append(Q.poll());
        }
        String string = sb.toString();
        return Long.parseLong(string);
    }
}
