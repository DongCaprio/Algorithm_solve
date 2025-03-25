import java.util.PriorityQueue;

class Solution {

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    class Node {
        int x;
        int y;
        int direction;
        int cost;

        public Node(int x, int y, int direction, int cost) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.cost = cost;
        }
    }

    public int solution(int[][] board) {
        int n = board.length;
        int[][][] goInfo = new int[n][n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    goInfo[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.offer(new Node(0, 0, -1, 0));

        int minValue = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int x = now.x, y = now.y, direction = now.direction, cost = now.cost;

            if (y == n - 1 && x == n - 1) {
                minValue = Math.min(minValue, now.cost);
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n ||
                        board[ny][nx] == 1) {
                    continue;
                }

                int newCost = cost + 100;
                if (direction != -1 && direction != i) {
                    newCost += 500;
                }
                if (newCost < goInfo[ny][nx][i]) {
                    goInfo[ny][nx][i] = newCost;
                    pq.offer(new Node(nx, ny, i, newCost));
                }
            }
        }

        return minValue;
    }
}
