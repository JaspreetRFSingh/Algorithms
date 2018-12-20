public class Anagram {

	private static boolean isAnagram(String s1, String s2) {
        int []ca = new int[26];
        int []cb = new int[26];

        for (char c : s1.toCharArray()) {
            ca[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            cb[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (ca[i] != cb[i]) {
                return false;
            }
        }

        return true;
    }

	
	public static void main(String[] args) {

		
		System.out.println(isAnagram("ifoalk", "fialok"));
	}

}
