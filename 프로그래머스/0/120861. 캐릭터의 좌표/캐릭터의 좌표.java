import java.util.Map;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;

        int x = 0, y = 0;

        // 방향 매핑: key → [dx, dy]
        Map<String, int[]> moveMap = Map.of(
                "left", new int[]{-1, 0},
                "right", new int[]{1, 0},
                "up", new int[]{0, 1},
                "down", new int[]{0, -1}
        );

        for (String key : keyinput) {
            int[] move = moveMap.get(key);
            int nx = x + move[0];
            int ny = y + move[1];

            // 경계 체크
            if (Math.abs(nx) <= maxX && Math.abs(ny) <= maxY) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}
