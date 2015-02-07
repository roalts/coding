package assignmentGraphs;

import java.util.ArrayList;
import java.util.HashMap;

import assignmentBinaryTrees.QueueEmptyException;

public class BiPartiteGraph {

	public static boolean checkBiPartiteGraph(Graph graph) throws QueueEmptyException{
		HashMap<Vertex, Boolean> hashMap1 = new HashMap<Vertex, Boolean>();
		HashMap<Vertex, Boolean> hashMap2 = new HashMap<Vertex, Boolean>();
		ArrayList<Vertex> vertices = graph.getVertices();
		Queue<Vertex> queue = new Queue<Vertex>();
		queue.enqueue(vertices.get(0));
		hashMap1.put(queue.front(), true);
		while(queue.isEmpty()){
			Vertex v = queue.dequeue();
			ArrayList<Vertex> adjacentVertices = v.getAdjacentVertices();
			if(hashMap1.containsKey(v)){
				for(Vertex vertex: adjacentVertices){
					if(!hashMap2.containsKey(vertex)){
						if(!hashMap1.containsKey(vertex)){
							hashMap2.put(vertex, true);
							queue.enqueue(vertex);
						}
						else
							return false;
					}
				}
			} else if(hashMap2.containsKey(v)){
				for(Vertex vertex: adjacentVertices){
					if(!hashMap1.containsKey(vertex)){
						if(!hashMap2.containsKey(vertex)){
							hashMap1.put(vertex, true);
							queue.enqueue(vertex);
						} else
							return false;
					}
				}
			} else
				return false;

		}
		return true;
	}



	public static void main(String[] args) throws VertexNotFoundException, QueueEmptyException {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex("a");
		g.addVertex("b");
		g.addVertex("c");
		//		g.addVertex("d");
		//		g.addVertex("e");
		//		g.addVertex("f");


		g.addEdge("a", "b");
		g.addEdge("a", "c");
		g.addEdge("b","c");

		//		g.addEdge("e", "c");
		//		g.addEdge("d", "b");
		//		g.addEdge("d", "f");
		//		g.addEdge("e", "f");
		//		g.addEdge("d", "e");

		//g.addEdge("d", "e");

		System.out.println(checkBiPartiteGraph(g));

	}

}
