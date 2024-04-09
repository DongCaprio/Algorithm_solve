import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int lt=0, rt=0;
            for(int j=0; j<commands[i].length; j++){
                if(j==0) lt = commands[i][j];
                else if(j==1) rt = commands[i][j];
                else{
                    int[] newArr = Arrays.copyOfRange(array, lt-1, rt);
                    Arrays.sort(newArr);
                    answer[i] = newArr[commands[i][j]-1];
                }
            }
        }
        
        return answer;
    }
}