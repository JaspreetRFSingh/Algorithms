package graphTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class GraphDFS{
	LinkedList<Integer> adjacencyLists[];
	int vertices;
	
	public GraphDFS(int vertices) {
		this.vertices = vertices;
		adjacencyLists = new LinkedList[vertices];
		for(int i=0; i<vertices; i++) {
			adjacencyLists[i] = new LinkedList<>();
		}
	}
	void addEdge(int u, int v) {
		adjacencyLists[u].add(v);
		Collections.sort(adjacencyLists[u], Collections.reverseOrder());
	}
	
	ArrayList<Integer> depthFirstTraversal(int s) {
		 ArrayList<Integer> visitedList = new ArrayList<>();
		 Stack<Integer> stack = new Stack<>();
		 int currentNode = s;
		 Iterator<Integer> iterator = adjacencyLists[currentNode].iterator();
		 while(iterator.hasNext()) {
			 stack.push(iterator.next());
		 }
		 visitedList.add(currentNode);
		 while(!stack.isEmpty()) {
			 currentNode = stack.peek();
			 if(!visitedList.contains(currentNode)) {
				 visitedList.add(currentNode);
			 }
			 stack.pop();
			 Iterator<Integer> iterator2 = adjacencyLists[currentNode].iterator();
			 while(iterator2.hasNext()) {
				 int next = iterator2.next();
				 if(!visitedList.contains(next)) {
					 stack.push(next);
				 }		 
			 }
		 }
		 return visitedList;
	}
}

public class DepthFirst {
	
	public static void main(String[] args) {
		
		GraphDFS g = new GraphDFS(5); 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
       System.out.println("Depth First Traversal: ");
       ArrayList<Integer> res = g.depthFirstTraversal(0);
       Iterator<Integer> iterator = res.iterator();
       while(iterator.hasNext()) {
    	   System.out.print(iterator.next()+" ");
       }
	}
}
