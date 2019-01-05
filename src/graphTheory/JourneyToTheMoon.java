package graphTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Graph{
	 List<Integer>[] vertices;
	    
	    public Graph(int count){
	        vertices = new ArrayList[count];
	        
	        for(int i = 0; i < count; i++){
	            vertices[i] = new ArrayList<Integer>();
	        }
	    }
	    
	    public void addEdge(int source, int destination){
	        vertices[source].add(destination);
	        vertices[destination].add(source);
	    }
	    
	    
	    public int dfs(int source, boolean[] visited){
	        visited[source] = true;
	        int count = 1;
	        
	        for(Integer vertex: vertices[source]){
	            if(!visited[vertex]){
	                count += dfs(vertex, visited);
	            }
	        }    
	        return count;
	    }
}

public class JourneyToTheMoon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int noa = in.nextInt();
        Graph graph = new Graph(noa);
        int nop = in.nextInt();
        for(int i = 0; i < nop; i++){
            int source = in.nextInt();
            int destination = in.nextInt();
            graph.addEdge(source,destination);
        }   
        boolean[] seen = new boolean[noa];
        List<Integer> countries = new ArrayList<Integer>();
        long combinations = 0;
        for(int i = 0; i < noa; i++){
            if(!seen[i]){
                countries.add(graph.dfs(i, seen));
            }
        }
        int sum = 0;
        for(int country : countries){
            combinations += sum*country;
            sum += country;    
        }
        System.out.println(combinations);
        in.close();
	}
}