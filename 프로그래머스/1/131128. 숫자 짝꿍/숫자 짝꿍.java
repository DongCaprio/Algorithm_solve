class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(char x : X.toCharArray()){
            int i = Character.getNumericValue(x);
            xArr[i]+=1;
        }
        for(char y : Y.toCharArray()){
            int i = Character.getNumericValue(y);
            yArr[i]+=1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            if(xArr[i] > 0 && yArr[i] > 0){
                int dupl = Math.min(xArr[i], yArr[i]);
                for(int j=0; j<dupl; j++){
                    sb.append(i);
                }
            }
        }
        if(sb.length() == 0) return "-1";
        if(sb.charAt(0) == '0' && sb.charAt(sb.length()-1) == '0') return "0";
        answer = sb.toString();
        return answer;
    }
}