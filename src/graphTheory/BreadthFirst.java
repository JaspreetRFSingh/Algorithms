package graphTheory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class GraphBFS{
	LinkedList<Integer> adjacencyLists[];
	int vertices;
	
	public GraphBFS(int vertices) {
		this.vertices = vertices;
		adjacencyLists = new LinkedList[vertices];
		for(int i=0; i<vertices; i++) {
			adjacencyLists[i] = new LinkedList<>();
		}
	}
	void addEdge(int u, int v) {
		adjacencyLists[u].add(v);
	}
	ArrayList<Integer> breadthFirstTraversal(int s) 
    {
		ArrayList<Integer> visitedList = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		int currentNode = s;
		Iterator<Integer> iterator = adjacencyLists[currentNode].iterator();
		 while(iterator.hasNext()) {
			 queue.add(iterator.next());
		 }
		 visitedList.add(currentNode);
		
		 while(!queue.isEmpty()) {
			 currentNode = queue.peek();
			 if(!visitedList.contains(currentNode)) {
				 visitedList.add(currentNode);
			 }
			 queue.poll();
			 Iterator<Integer> iterator2 = adjacencyLists[currentNode].iterator();
			 while(iterator2.hasNext()) {
				 int next = iterator2.next();
				 if(!visitedList.contains(next)) {
					 queue.add(next);
				 }		 
			 }
		 }
		 
		return visitedList;
    }
}
public class BreadthFirst {
	public static void main(String[] args) {
		GraphBFS g = new GraphBFS(5); 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
       System.out.println("Breadth First Traversal: ");
	   
	   ArrayList<Integer> res = g.breadthFirstTraversal(0);
       Iterator<Integer> iterator = res.iterator();
       while(iterator.hasNext()) {
    	   System.out.print(iterator.next()+" ");
       }
	}

}
