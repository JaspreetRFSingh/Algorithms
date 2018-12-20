
public class QuickSort {

	void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int idx = partition(arr, start, end);
			quickSort(arr, start, idx-1);
			quickSort(arr, idx+1, end);
		}
	}
	int partition(int[] arr, int start, int end ) {
		int pIndex = start-1;
		int pivot = arr[end];
		for(int i =start; i<end; i++) {
			if(arr[i]<=pivot) {
				pIndex++;
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
			}
		}
		int temp = arr[pIndex+1];
		arr[pIndex+1] = arr[end];
		arr[end] = temp;
		return pIndex+1;
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int [] arr = {23, 45, 67, 4, 12, 19, 89, 11, 9};
		int n = arr.length;
		qs.quickSort(arr,0,n-1);
		qs.printArray(arr);
	}

}
