class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int h = 3; h <= total / 3; h++) {
            int width = total / h;
            if (width < h) {
                continue;
            }
            if ((width - 2) * (h - 2) == yellow) {
                return new int[]{width, h};
            }
        }
        int[] answer = {};
        return answer;
    }
}
