class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][j] != 1) {
                    continue;
                }
                int left = board[i][j - 1];
                int up = board[i - 1][j];
                int cross = board[i - 1][j - 1];
                int value = Math.min(Math.min(up, left), cross) + 1;
                board[i][j] = value;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer = Math.max(answer, board[i][j]);
            }
        }

        return answer * answer;
    }
}
