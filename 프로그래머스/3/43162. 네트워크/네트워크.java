class Solution {
    boolean[] visited;
    int[][] computer;

    public void dfs(int now) {
        visited[now] = true;
        for (int x = 0; x < computer[now].length; x++) {
            if (!visited[x] && computer[now][x] == 1) {
                dfs(x);
            }
        }

    }

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        computer = computers;

        int networkCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                networkCount++;
            }

        }


        return networkCount;
    }
}