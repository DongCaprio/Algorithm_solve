class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        answer = new int[str.length()];
        System.out.println(str);
        for(int i=0; i<answer.length; i++) {
        	answer[i] = Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}