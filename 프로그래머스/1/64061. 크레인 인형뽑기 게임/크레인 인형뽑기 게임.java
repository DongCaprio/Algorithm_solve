import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int x : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][x-1]>0){
                    if(!stack.isEmpty()){
                        int peek = stack.peek();
                        if(peek == board[i][x-1]){
                            stack.pop();
                            answer +=2;
                        }else{
                            stack.push(board[i][x-1]);
                        }
                    }else{
                        stack.push(board[i][x-1]);
                    }
                    board[i][x-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}