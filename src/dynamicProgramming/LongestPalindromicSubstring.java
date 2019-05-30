package dynamicProgramming;

public class LongestPalindromicSubstring {

	
	static boolean isPalindrome(String str) {
		boolean isPali = true;
		int strLen = str.length();
		
		if(strLen==1) {
			return true;
		}
		
		for(int i=0;i<strLen/2; i++) {
			if(str.charAt(i)!=str.charAt(strLen-i-1)){
				isPali = false;
				break;
			}
		}
		
		return isPali;
		
	}
	
	static String longestPalindrome(String str) {
		String result = "";
		
		int strLen = str.length();
		boolean [][] plTable = new boolean[strLen][strLen];
		int max=1;
		for(int i=0; i<strLen; i++) {
			for(int j=i; j<strLen; j++) {
				System.out.println(str.substring(i, j+1));
				if(isPalindrome(str.substring(i, j+1))) {
					plTable[i][j] = true;
					String tempresult = str.substring(i, j+1);
					if(tempresult.length()>max) {
						max = tempresult.length();
						result = tempresult;
					}
					
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(isPalindrome("aba"));
//		String strr="jaspreet";
		//System.out.println(strr.substring(1, 4));
		System.out.println(longestPalindrome("forgeeksskeegfor"));

	}

}
