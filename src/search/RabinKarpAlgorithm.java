package search;

public class RabinKarpAlgorithm {

	static int isMatched(String string, String pattern, int q) {
		int shash = 0;
		int phash = 0;
		int slen = string.length();
		int plen = pattern.length();
		for(int i=0; i<plen; i++) {
			phash += pattern.charAt(i)*Math.pow(q, i);
			shash += string.charAt(i)*Math.pow(q, i);
		}
		for(int i=0; i<=slen-plen; i++) {
			if(phash == shash) {
				int j = 0;
				for(j=0; j<plen; j++) {
					if(string.charAt(i+j)!=pattern.charAt(j)) {
						break;
					}
				}
				if(j==plen) {
					return i;
				}
			}
			if (i<slen - plen) 
			{ 
	                shash = (int) ((shash - string.charAt(i))/q + string.charAt(i+plen)*Math.pow(q, plen-1)); 
	                if (shash < 0) {
	                	shash = shash + q; 
	                }
	            } 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String text = "Hello, I am a Java program inplementing Rabin Karp String Searching algorithm";
		String pattern = "Java";
		int pn = 101;
		int res = isMatched(text, pattern, pn);
		if(res>=0) {
			System.out.println("Pattern matched at index: "+res);
		}
		else {
			System.out.println("Pattern is not a part of the string!");
		}	
	}
}
