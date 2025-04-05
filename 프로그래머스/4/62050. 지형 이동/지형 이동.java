import java.util.PriorityQueue;

class Solution {

    boolean[][] visited;
    int[][] goArr = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    class Node {
        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    public int solution(int[][] land, int height) {
        int answer = 0;
        visited = new boolean[land.length][land.length];
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.offer(new Node(0, 0, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visited[now.y][now.x]) {
                continue;
            }

            visited[now.y][now.x] = true;
            answer += now.cost;

            for (int[] go : goArr) {
                int nx = now.x + go[0];
                int ny = now.y + go[1];

                if (nx < 0 || ny < 0 || nx >= land.length || ny >= land.length) {
                    continue;
                }

                int tempCost = Math.abs(land[now.y][now.x] - land[ny][nx]);
                int newCost = tempCost > height ? tempCost : 0;
                pq.offer(new Node(nx, ny, newCost));
            }
        }

        return answer;
    }
}
