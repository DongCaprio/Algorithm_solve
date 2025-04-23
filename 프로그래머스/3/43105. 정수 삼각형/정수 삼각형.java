class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[n - 1][i] = triangle[n - 1][i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                answer[i][j] = triangle[i][j] + Math.max(answer[i + 1][j], answer[i + 1][j + 1]);
            }
        }

        return answer[0][0];
    }
}
