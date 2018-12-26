package search;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {

	static String balancedSums(List<Integer> arr) {
		boolean isFound = false;
		int n = arr.size();
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+arr.get(j);
		}
		int right=0;
		
		for(int j=n-1;j>=0;j--)
		{
			if(j != n-1)
				right=right+arr.get(j+1);
				sum=sum-arr.get(j);
			if(sum==right)
			{
				isFound = true;
				break;
			}
		}
		if(isFound)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}
    }
	
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(0);
		arr.add(1);
		System.out.println(balancedSums(arr));
	}

}
