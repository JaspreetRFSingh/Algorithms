package arrays;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	 public static int pickingNumbers(List<Integer> a) {	
		 Collections.sort(a);
		 int length = a.size();
		 int max = 0;
		 for(int i=length-1;i>=0; i--) {
			 int count = 1;
			 for(int j=i-1; j>=0 ; j--) {
				 if((a.get(i)-a.get(j))<2){
			            count++;
			        }
			 }
			 max = count>max?count:max;
		 }
		 return max;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
