package sort;

public class MergeSort {

	static void merge(int[] left, int[] right, int[] arr) {
		int nl = left.length;
		int nr = right.length;
		int i =0, j=0, k=0;
		while(i<nl && j<nr) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<nl) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<nr) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	static void mergeSort(int[] arr) {
		int n= arr.length;
		if(n<2) {
			return;
		}
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		for(int i=mid; i<n; i++) {
			right[i-mid]=arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}
	static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0 ;i <n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {23, 45, 67, 4, 12, 19, 89, 11, 9};
		printArray(arr);
		mergeSort(arr);
		System.out.println();
		printArray(arr);
	}

}
