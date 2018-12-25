package search;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MissingNumbers {

	static int[] missingNumbers(int[] arr, int[] brr) {
		
		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
		ArrayList<Integer> resList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(aMap.containsKey(arr[i])) {
				aMap.put(arr[i], aMap.get(arr[i])+1);
			}
			else {
				aMap.put(arr[i], 1);
			}
		}
		for(int i=0; i<brr.length; i++) {
			if(bMap.containsKey(brr[i])) {
				bMap.put(brr[i], bMap.get(brr[i])+1);
			}
			else {
				bMap.put(brr[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : bMap.entrySet())
		{
		    if(aMap.containsKey(entry.getKey())){
		    	if(aMap.get(entry.getKey())<entry.getValue()) {
		    		resList.add(entry.getKey());
		    	}
		    }
		    else {
		    	resList.add(entry.getKey());
		    }
		}
		
		Collections.sort(resList);
		int[] missingArray = new int[resList.size()];
		Iterator<Integer> iterator = resList.iterator();
		int i =0;
		while(iterator.hasNext()) {
			missingArray[i] = iterator.next();
			i++;
		}
		return missingArray;
    }
	public static void main(String[] args) {
		int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
		int [] res= missingNumbers(arr, brr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
}
