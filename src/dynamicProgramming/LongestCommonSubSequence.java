package dynamicProgramming;

public class LongestCommonSubSequence {

	static int lcsubsequence(String input1, String input2) {
		int len1 = input1.length();
		int len2 = input2.length();
		int [][] longestLength = new int[len1+1][len2+1];
		
		int result = 0;
		
		for(int i=1; i<=len1; i++) {
			for(int j=1; j<=len2; j++) {
				if(input1.charAt(i-1) == input2.charAt(j-1)) {
					longestLength[i][j] = longestLength[i-1][j-1]+1;
				}
				else {
					longestLength[i][j] = Math.max(longestLength[i][j-1], longestLength[i-1][j]);
				}
				if(result<longestLength[i][j]) {
					result = longestLength[i][j];
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(lcsubsequence("abcdaf", "acbcf"));
	}

}
