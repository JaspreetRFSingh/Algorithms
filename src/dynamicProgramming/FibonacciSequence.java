package dynamicProgramming;

public class FibonacciSequence {

	public static int fibonacci(int n) {
		int[] memo = new int[n+2];
		
		memo[0] = 0;
		memo[1] = 1;
			for(int i=2; i<=n; i++) {
				memo[i] = fibonacci(i-1) + fibonacci(i-2);	
			}
			
		return memo[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(9));

	}

}
