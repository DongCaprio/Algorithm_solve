class Solution {
    public int[] solution(int n, int m) {
        int n1 = Math.min(n, m);
        int m1 = Math.max(n, m);
        System.out.print(n1+" "+m1);
        int min=1, max=m;
        for(int i=1; i<=n; i++) {
        	if(n%i==0 && m%i==0) {
        		min = Math.max(min, i);
        	}
        }
        for(int i=m; i<=m*n; i++) {
        	if(i%n == 0 && i%m== 0) {
        		max = i;
        		break;
        	}
        }
        int[] answer = {min, max};
        return answer;
    }
}