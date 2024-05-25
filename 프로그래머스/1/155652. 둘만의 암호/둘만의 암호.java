class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] skipArr = skip.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()) {
            for(int i=0; i<index; i++){
                x++;
                if(x > 'z') x -= 26;
                if(skip.contains(Character.toString(x))) i--;
            }
            sb.append(x);
        }

        return sb.toString();
    }
}