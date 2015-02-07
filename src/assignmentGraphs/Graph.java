package assignmentGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	private ArrayList<Vertex> vertices;
	
	public Graph() {
		vertices = new ArrayList<Vertex>();
	}
	
	public int numVertices() {
		return vertices.size();
	}
	
	public int numEdges() {
		int count = 0;
		for (int i = 0; i < vertices.size(); i++) {
			count += vertices.get(i).numEdges();
		}
		return count/2;
	}
	
	private boolean vertexPresent(String v) {
		for (Vertex vertex: vertices) {
			if (vertex.name.equals(v)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Vertex> getVertices(){
		ArrayList<Vertex> allVertices = new ArrayList<Vertex>();
		for (Vertex vertex : vertices){
			allVertices.add(vertex);			
		}
		
		return allVertices;
	}
	
	public void addVertex(String vertexName) {
		if (vertexPresent(vertexName)) {
			return;
		}
		Vertex newVertex = new Vertex();
		newVertex.name = vertexName;
		vertices.add(newVertex);
	}
	
	private Vertex findVertex(String vertexName) {
		for (Vertex v: vertices) {
			if (v.name.equals(vertexName)) {
				return v;
			}
		}
		return null;
	}
	
	public void addEdge(String vertexName1, String vertexName2) throws VertexNotFoundException {
		Vertex vertex1 = findVertex(vertexName1);
		Vertex vertex2 = findVertex(vertexName2);
		
		if (vertex1 == null || vertex2 == null) {
			VertexNotFoundException e = new VertexNotFoundException();
			throw e;
		}
		
		if (vertex1.isAdjacent(vertex2)) {
			return;
		}
		
		Edge e = new Edge();
		e.firstVertex = vertex1;
		e.secondVertex = vertex2;
		
		vertex1.addEdge(e);
		vertex2.addEdge(e);
	}
	
	
	public void removeEdge(String vertexName1, String vertexName2) {
		Vertex vertex1 = findVertex(vertexName1);
		Vertex vertex2 = findVertex(vertexName2);
		
		if (vertex1 == null || vertex2 == null) {
			return;
		}
		
		vertex1.removeEdgeWith(vertex2);
		vertex2.removeEdgeWith(vertex1);
		
	}
	
	public void removeVertex(String vertexName) {
		Vertex vertex = findVertex(vertexName);
		if (vertex != null) {
			ArrayList<Edge> edges = vertex.adjacentEdges;
			for (Edge e : edges) {
				if (e.firstVertex == vertex) {
					e.secondVertex.removeEdgeWith(vertex);
				} else {
					e.firstVertex.removeEdgeWith(vertex);
				}
			}
			vertices.remove(vertex);
		}
	}
	
	
	public ArrayList<String> getAdjacent(String vertexName) {
		Vertex vertex = findVertex(vertexName);
		if (vertex != null) {
			return vertex.getAdjacent();
		} else {
			return null;
		}
	}
	
	public void print() {
		for (Vertex v: vertices) {
			ArrayList<String> adjacent = v.getAdjacent();
			String temp = "";
			for (String s: adjacent) {
				temp += ", " + s;
			}
			
			System.out.println(v.name + ": " + temp);
 		}
	}
	
	public boolean isConnected(String vertexName1, String vertexName2) {
		Vertex vertex1 = findVertex(vertexName1);
		Vertex vertex2 = findVertex(vertexName2);
		
		if (vertex1 == null || vertex2 == null) {
			return false;
		}
		
		StackUsingLL<Vertex> toBeProcessed = new StackUsingLL<Vertex>();
		
		//ArrayList<Vertex> visited = new ArrayList<Vertex>();
		HashMap<Vertex, Boolean> visited = new HashMap<Vertex, Boolean>();
		toBeProcessed.push(vertex1);
		visited.put(vertex1, true);
		
		while (!toBeProcessed.isEmpty()) {
			Vertex topVertex = null;
			try {
				topVertex = toBeProcessed.pop();
			} catch (StackEmptyException e) {
				return false;
			}
			
			if (topVertex.isAdjacent(vertex2)) {
				return true;
			}
			
			
			ArrayList<Vertex> adjacentVertices = topVertex.getAdjacentVertices();
			
			for (Vertex v: adjacentVertices) {
				if (!visited.containsKey(v)) {
					toBeProcessed.push(v);
					visited.put(topVertex, true);
				}
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) throws VertexNotFoundException {
		Graph g = new Graph();
		g.addVertex("a");
		g.addVertex("b");
		g.addVertex("c");
		g.addVertex("d");
		g.addVertex("e");
		
		g.addEdge("a", "b");
		g.addEdge("a", "c");
		g.addEdge("d", "c");
		//g.addEdge("d", "b");
		g.addEdge("d", "e");
		
		
		System.out.println(g.isConnected("a", "e"));
		
		
	}
}
