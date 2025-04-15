class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;

        int[][] go = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

        for (String dir : keyinput) {
            if (dir.equals("right")) {
                if (answer[0] + go[0][0] > maxX) {
                    continue;
                }
                answer[0] += go[0][0];
            } else if (dir.equals("left")) {
                if (answer[0] + go[1][0] < -(maxX)) {
                    continue;
                }
                answer[0] += go[1][0];
            } else if (dir.equals("down")) {
                if (answer[1] + go[2][1] < -(maxY)) {
                    continue;
                }
                answer[1] += go[2][1];
            } else if (dir.equals("up")) {
                if (answer[1] + go[3][1] > maxY) {
                    continue;
                }
                answer[1] += go[3][1];
            }
        }

        return answer;
    }
}
