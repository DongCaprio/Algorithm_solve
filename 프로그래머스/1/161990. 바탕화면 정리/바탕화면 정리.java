class Solution {
    public int[] solution(String[] wallpaper) {
        int[][] wallArr = new int[wallpaper.length][wallpaper[0].length()];
        int xMax = Integer.MIN_VALUE, xMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE, yMin = Integer.MAX_VALUE;

        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    wallArr[i][j] = 1;
                    xMax = Math.max(j, xMax);
                    xMin = Math.min(j, xMin);
                    yMax = Math.max(i, yMax);
                    yMin = Math.min(i, yMin);
                }
            }
        }

        int[] answer = {yMin, xMin, yMax+1, xMax+1};
        for(int x : answer){
            System.out.println(x);
        }

        return answer;
    }
}