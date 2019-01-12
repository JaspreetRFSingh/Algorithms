package graphTheory;

public class FloydWarshall {

	static int max = 999999;
	static int[][] computeDistances(int[][] distances, int length){
		int [][] minDistances = distances;

		for(int k=0; k<length; k++) {
			for(int i=0; i<length; i++) {
				for(int j=0; j<length; j++) {
					if(minDistances[i][k] + minDistances[k][j] < minDistances[i][j]){
						minDistances[i][j] = minDistances[i][k] + minDistances[k][j];
					}
				}
			}
		}
		
		return minDistances;
	}
	
	static void printDistances(int[][] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				int temp = data[i][j];
				if(data[i][j] == max) {
					temp = -1;
				}
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] distances = {{0,3,max,5}, {1,0,1,4}, {max,max,0,7}, {max,8,1,0}};
		System.out.println("Initial Graph nodes' distances: ");
		printDistances(distances);
		int[][] result = computeDistances(distances, distances.length);
		System.out.println();
		System.out.println("Minimum Distances");
		printDistances(result);

	}

}
