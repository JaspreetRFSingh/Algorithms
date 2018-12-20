public class Anagram {

        static boolean isAnagram(String s1, String s2) {
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for(char c: s1.toCharArray()) {
			arr1[c-'a']++;
		}
		for(char c: s2.toCharArray()) {
			arr2[c-'a']++;
		}
		for(int i =0; i<26; i++) {
			if(arr1[i]!= arr2[i]) {
				return false;
			}
		}
		return true;
	}
  

	
	public static void main(String[] args) {

		
		System.out.println(isAnagram("ifoalk", "fialok"));
	}

}
