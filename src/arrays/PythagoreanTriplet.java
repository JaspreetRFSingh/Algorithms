package arrays;

import java.util.Arrays;

public class PythagoreanTriplet {

	static boolean containsPythagoreanTriplet(int[] arr) {
		boolean flag = false;
		int arrlen = arr.length;
		for(int i=0; i<arrlen; i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		
		for(int i = arrlen-1; i>=2; i--) {
			
			int b = 0;
			int c = i-1;
			while(b<c) {
				if(arr[i] == arr[b]+arr[c]) {
					return true;
				}
				else if(arr[i]>arr[b]+arr[c]){
					b++;
				}
				else {
					c--;
				}
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {12, 13, 4, 6, 5}; 
        if (containsPythagoreanTriplet(arr)==true) 
           System.out.println("Yes, It contains a Pythagorean Triplet"); 
        else
           System.out.println("No, It does not contain a Pythagorean Triplet"); 
	}

}
