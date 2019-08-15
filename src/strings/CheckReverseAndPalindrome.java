package strings;

import java.util.Scanner;

public class CheckReverseAndPalindrome {

	public static boolean isPalindrome(String str) {
		boolean flag = true;
		String strTemp = str.toLowerCase();
		int len = strTemp.length();
		for(int i=0; i<len/2; i++) {
			if(strTemp.charAt(i) != strTemp.charAt(len-1-i)) {
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		String []arr = input.split(" ");
		System.out.println("Reverse:- ");
		int len = arr.length;
		for(int i=0; i<len; i++) {
			String reverse = "";
			int lenTemp = arr[i].length();
			for(int j = lenTemp-1; j>=0; j--) {
				reverse = reverse + arr[i].charAt(j);
			}
			System.out.print(reverse+" ");
		}
		System.out.println("\nPalindrome Strings: ");
		for(int i=0; i<len; i++) {
			if(isPalindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		sc.close();

	}

}
