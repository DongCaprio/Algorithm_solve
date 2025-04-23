class Solution {
    int solution(int[][] land) {

        int[][] answer = new int[land.length][4];
        for (int i = 0; i < 4; i++) {
            answer[0][i] = land[0][i];
        }
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (k == j) {
                        continue;
                    }
                    max = Math.max(answer[i - 1][k], max);
                }
                answer[i][j] = land[i][j] + max;
            }
        }
        int max = 0;
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, answer[land.length - 1][i]);
        }
        return max;
    }
}
