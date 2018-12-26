package dynamicProgramming;

public class ZeroOneKnapsack {

	static int knapsack(int totalWeight, int itemCount, int[] weights, int[] values) {
		int[][] data = new int[itemCount+1][totalWeight+1];
		
		for(int i =0; i<=itemCount; i++) {
			for(int j=0; j<=totalWeight; j++) {
				if(i==0 || j==0) {
					data[i][j] = 0;
				}
				else if(weights[i-1]<=totalWeight) {
					data[i][j] = Math.max(values[i-1] + data[i-1][totalWeight-weights[i-1]],  data[i-1][totalWeight]);
				}
				else {
					data[i][j] = data[i-1][j];
				}
			}
		}
		
		return data[itemCount][totalWeight];
	}
	
	public static void main(String[] args) {
		int values[] = {60, 100, 120, 56, 90, 20}; 
	    int weights[] = {16, 29, 3, 11, 17, 41}; 
	    int  W = 75; 
	    int n = values.length; 
	    System.out.println(knapsack(W, n, weights, values)); 
	}

}
