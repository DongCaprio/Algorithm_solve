class Solution {
    public int solution(String s) {
        if(s.length() == 1) return 1;
        
        int answer = 0;
        char[] arr = s.toCharArray();
        char first = arr[0];
        int count1 =1, count2 =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == first){
                count1++;
            }else{
                count2++;
            }
            if(count1 == count2) {
                if(i+1<arr.length){
                    first = arr[i+1];
                    count1 =0;
                    count2 =0;
                    answer++;
                }else{
                    answer++;
                }

            }else{
                if(i+1 == arr.length) answer++;
            }
        }
        return answer;
    }
}