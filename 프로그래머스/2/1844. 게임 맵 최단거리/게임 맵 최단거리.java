import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[][] visited;

    int[] go1 = {1, 0, 0, -1};
    int[] go2 = {0, 1, -1, 0};

    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        Queue<Node> Q = new LinkedList<>();
        Q.offer(new Node(0, 0));
        visited[0][0] = 1;

        while (!Q.isEmpty()) {
            Node now = Q.poll();

            for (int i = 0; i < go1.length; i++) {
                int nx = now.x + go1[i];
                int ny = now.y + go2[i];

                if (nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length
                        || maps[ny][nx] == 0) {
                    continue;
                }

                if (visited[ny][nx] == 0) {
                    Q.offer(new Node(nx, ny));
                    visited[ny][nx] = visited[now.y][now.x] + 1;
                }
            }
        }

        if (visited[maps.length - 1][maps[0].length - 1] > 0) {
            return visited[maps.length - 1][maps[0].length - 1];
        }
        return -1;
    }

}
