import java.util.PriorityQueue;

class Solution {

    int[][][] cost;
    int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    class Node {
        int x;
        int y;
        int dir;
        int cost;

        public Node(int x, int y, int dir, int cost) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
    }


    public int solution(int[][] board) {
        int n = board.length;
        cost = new int[n][n][direction.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < direction.length; k++) {
                    cost[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.offer(new Node(0, 0, -1, 0));

        int minCost = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {

            Node now = pq.poll();

            if (now.y == n - 1 && now.x == n - 1) {
                minCost = Math.min(minCost, now.cost);
            }

            for (int newDir = 0; newDir < direction.length; newDir++) {
                int nx = direction[newDir][0] + now.x;
                int ny = direction[newDir][1] + now.y;

                if (nx < 0 || ny < 0 || nx >= n || ny >= n || board[ny][nx] == 1) {
                    continue;
                }

                int newCost = now.cost + 100;
                if (now.dir != -1 && now.dir != newDir) {
                    newCost += 500;
                }

                if (newCost < cost[ny][nx][newDir]) {
                    cost[ny][nx][newDir] = newCost;
                    pq.offer(new Node(nx, ny, newDir, newCost));
                }
            }

        }

        return minCost;
    }
}
