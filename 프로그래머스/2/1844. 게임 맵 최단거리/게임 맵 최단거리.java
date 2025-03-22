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


    public int solution(int[][] maps) {
        int y = maps.length;
        int x = maps[0].length;

        int[][] crossShape = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

        int[][] distance = new int[y][x];
        Queue<Node> Q = new LinkedList<>();
        Q.offer(new Node(0, 0));
        distance[0][0] = 1;

        while (!Q.isEmpty()) {
            Node pollQ = Q.poll();

            int xQ = pollQ.x;
            int yQ = pollQ.y;

            for (int[] move : crossShape) {
                int nextX = xQ + move[0];
                int nextY = yQ + move[1];

                if (nextX < 0 || nextY < 0 || nextX >= x || nextY >= y) {
                    continue;
                }
                if (maps[nextY][nextX] == 0) {
                    continue;
                }
                if (distance[nextY][nextX] == 0) {
                    distance[nextY][nextX] = distance[yQ][xQ] + 1;
                    Q.offer(new Node(nextX, nextY));
                }
            }
        }

        if (distance[y - 1][x - 1] == 0) {
            return -1;
        }

        return distance[y - 1][x - 1];
    }
}