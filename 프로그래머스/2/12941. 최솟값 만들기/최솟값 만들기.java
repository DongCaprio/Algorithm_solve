import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0, j=A.length-1; i<A.length; i++, j--) {
        	int val = A[i] * B[j];
        	answer += val;
        }

        return answer;
    }
}