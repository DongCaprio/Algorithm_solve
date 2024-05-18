class Solution {
    public String solution(int num) {
        String answer = "Even";
        System.out.print(0%2);
        if(num%2 == 1 || num%2 == -1) return "Odd";
        return answer;
    }
}