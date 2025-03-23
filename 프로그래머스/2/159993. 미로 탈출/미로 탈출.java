import java.util.LinkedList;
import java.util.Queue;

class Solution {

    int[][] map;
    int[][] moveArray = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    class Node {
        int x;
        int y;
        int dist;

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public int bfs(int startX, int startY, char target) {
        boolean[][] visited = new boolean[map.length][map[0].length];
        Queue<Node> Q = new LinkedList<>();
        Q.offer(new Node(startX, startY, 0));
        visited[startY][startX] = true;

        while (!Q.isEmpty()) {
            Node current = Q.poll();

            if (map[current.y][current.x] == target) {
                return current.dist;
            }

            for (int[] move : moveArray) {
                int nx = current.x + move[0];
                int ny = current.y + move[1];

                if (nx >= map[0].length || ny >= map.length ||
                        nx < 0 || ny < 0 ||
                        map[ny][nx] == 'X' || visited[ny][nx]) {
                    continue;
                }

                visited[ny][nx] = true;
                Q.offer(new Node(nx, ny, current.dist + 1));
            }
        }
        return -1;
    }


    public int solution(String[] maps) {
        int startX = 0;
        int startY = 0;
        int leverX = 0;
        int leverY = 0;

        map = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            char[] charArray = maps[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                map[i][j] = charArray[j];
                if (charArray[j] == 'S') {
                    startY = i;
                    startX = j;
                }
                if (charArray[j] == 'L') {
                    leverY = i;
                    leverX = j;
                }

            }
        }

        int leverCount = bfs(startX, startY, 'L');
        if (leverCount == -1) return -1;
        int exitCount = bfs(leverX, leverY, 'E');
        if (exitCount == -1) return -1;

        return leverCount + exitCount;
    }
}
