package dynamicProgramming;

public class CountThePaths {
	public static void main(String[] args) {
		
		int [][] path =  {{0,0,0,0,0,0,0,0},
						  {0,0,1,0,0,0,1,0},
						  {0,0,0,0,1,0,0,0},
						  {1,0,1,0,0,1,0,0},
						  {0,0,1,0,0,0,0,0},
						  {0,0,0,1,1,0,1,0},
						  {0,1,0,0,0,1,0,0},
						  {0,0,0,0,0,0,0,0}};
		int row = path.length;
		int col = path[0].length;
		int [][] numPaths = new int[row][col];
		for(int i=row-1; i>=0; i--) {
			for(int j=col-1; j>=0; j--) {
				if(i==row-1 || j==col-1) {
					numPaths[i][j] = 1;
				}
				else {
					if(path[i][j]==1) {
						numPaths[i][j] = 0;
					}
					else {
						numPaths[i][j] = numPaths[i+1][j] + numPaths[i][j+1]; 
					}
				}
			}
		}
//		for (int i = 0; i < numPaths.length; i++) {
//			
//			for (int j = 0; j < numPaths[0].length; j++) {
//				System.out.print(numPaths[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(numPaths[0][0]);

	}

}
