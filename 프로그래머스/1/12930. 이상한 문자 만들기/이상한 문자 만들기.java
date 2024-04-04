class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                cnt=0;
                continue;
            }
            cnt++;
            if(cnt%2==1) arr[i] = Character.toUpperCase(arr[i]);
            else if(cnt%2==0) arr[i] = Character.toLowerCase(arr[i]);
        }
        answer = new String(arr);
        return answer;
    }
}