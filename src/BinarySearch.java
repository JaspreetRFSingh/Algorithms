
public class BinarySearch {

	static int searchElement(int[] arr, int element) {
		int idx = -1;
		int start = 0;
		int end = arr.length;
		int mid = (start+end)/2;
		while(start<=end) {
			if(element==arr[mid]) {
				idx = mid;
				break;
			}
			else if(element<arr[mid]) {
				end = mid-1;
			}
			else if(element>arr[mid]){
				start = mid+1;
			}
			mid = (start+end)/2;
		}
		if ( start >= end ){  
		      idx = -1;  
		   } 
		return idx;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,6,8,9,12,15,17,19,34};
		int res = searchElement(arr, 34);
		if(res==-1) {
			System.out.println("Element is not in the list");
		}
		else {
			System.out.println("Element is present at index: "+res);
		}
	}

}
