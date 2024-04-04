class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int sum = 0;
        for(char y : arr){
            sum +=Character.getNumericValue(y);
        }
        if(x%sum!=0) answer = false;
        
        
        return answer;
    }
}