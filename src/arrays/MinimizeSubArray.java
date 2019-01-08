package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MinimizeSubArray {

	static int getMinLengthSubArray(int[] arr, int x) {
		ArrayList<Integer> arrList = new ArrayList<>();
		int alen = arr.length;
		int sum = 0 ;
		for(int j=0; j<alen; j++) {
			sum=0;
			for(int i = j; i<alen; i++) {
				sum += arr[i];
				if(sum>x) {
					sum = 0;
					arrList.add(i-j+1);
					break;
				}
				
			}
		}
		Collections.sort(arrList);
		return arrList.get(0);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
        int x = 51; 
        int res = getMinLengthSubArray(arr1, x);
        System.out.println("Answer: "+res);
        int arr2[] = {1, 10, 5, 2, 7};
        x = 9;
        res = getMinLengthSubArray(arr2, x);
        System.out.println("Answer: "+res);
        int arr3[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        x = 280; 
        res = getMinLengthSubArray(arr3, x);
        System.out.println("Answer: "+res);
	}
}
