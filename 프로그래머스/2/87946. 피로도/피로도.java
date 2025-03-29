class Solution {
    private int answer = 0;
    private boolean[] visited;
    private int[][] dungeons;

    private void backtrack(int k, int cnt) {
        answer = Math.max(answer, cnt);

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                backtrack(k - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        backtrack(k, 0);
        return answer;
    }
}
