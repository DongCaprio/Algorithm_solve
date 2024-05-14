class Solution {
	
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	int[][] arr = new int[n][n];
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
        	int decimal1 = arr1[i];
        	int decimal2 = arr2[i];
        	String binary1 = makeBinary(decimal1, n);
        	String binary2 = makeBinary(decimal2, n);
        	for(int k=0; k<n; k++) {
        		if(binary1.charAt(k) == '1' || binary2.charAt(k) == '1') {
        			arr[i][k] = 1;
        		}
        	}
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(arr[i][j] == 0) {
        			sb.append(" ");
        		}else {
        			sb.append("#");
        		}
        	}
        	answer[i] = sb.toString();
        	sb.setLength(0);
        }
        return answer;
    }
    
    
    public String makeBinary(int decimal, int length) {
    	String binary = Integer.toBinaryString(decimal);
    	if(binary.length()<length) {
    		StringBuilder sb = new StringBuilder();
    		for(int i=0; i<length-binary.length(); i++) {
    			sb.append("0");
    		}
    		binary = sb + binary; 
    	}
    	return binary;
    }
    
}