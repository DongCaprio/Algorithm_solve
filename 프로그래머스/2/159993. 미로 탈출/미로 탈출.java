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

    Node lever, start, end;
    String[] maps;
    int[][] move = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int xLength, yLength;

    public int solution(String[] maps) {
        this.maps = maps;
        xLength = maps[0].length();
        yLength = maps.length;

        for (int i = 0; i < yLength; i++) {
            for (int j = 0; j < xLength; j++) {
                if (maps[i].charAt(j) == 'L') {
                    lever = new Node(j, i);
                }
                if (maps[i].charAt(j) == 'S') {
                    start = new Node(j, i);
                }
                if (maps[i].charAt(j) == 'E') {
                    end = new Node(j, i);
                }
            }
        }

        int toLever = bfs(start, lever);
        if (toLever == -1) {
            return -1;
        }
        int toEnd = bfs(lever, end);
        if (toEnd == -1) {
            return -1;
        }

        return toLever + toEnd;
    }


    public int bfs(Node start, Node target) {
        int[][] dist = new int[yLength][xLength];
        Queue<Node> Q = new LinkedList<>();
        dist[start.y][start.x] = 1;
        Q.offer(start);

        while (!Q.isEmpty()) {
            Node now = Q.poll();
            for (int[] movee : move) {
                int nx = movee[0] + now.x;
                int ny = movee[1] + now.y;

                if (nx < 0 || ny < 0 || nx >= xLength || ny >= yLength ||
                        maps[ny].charAt(nx) == 'X' ||
                        dist[ny][nx] > 0) {
                    continue;
                }

                dist[ny][nx] = dist[now.y][now.x] + 1;
                Q.offer(new Node(nx, ny));

                if (nx == target.x && ny == target.y) {
                    return dist[ny][nx] - 1;
                }
            }
        }

        return -1;
    }
}
