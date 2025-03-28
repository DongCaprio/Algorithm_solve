import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] wires) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        int minValue = Integer.MAX_VALUE;

        for (int[] wire : wires) {

            graph.get(wire[0]).remove(Integer.valueOf(wire[1]));
            graph.get(wire[1]).remove(Integer.valueOf(wire[0]));

            int sizeA = bfs(wire[0], n, graph);
            int sizeB = n - sizeA;

            minValue = Math.min(minValue, Math.abs(sizeA - sizeB));

            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        return minValue;
    }

    public int bfs(int start, int n, List<List<Integer>> graph) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> Q = new LinkedList<>();

        visited[start] = true;
        Q.offer(start);
        int goCount = 1;

        while (!Q.isEmpty()) {
            int now = Q.poll();

            for (int target : graph.get(now)) {
                if (visited[target]) {
                    continue;
                }
                Q.offer(target);
                visited[target] = true;
                goCount++;
            }
        }
        return goCount;
    }
}
