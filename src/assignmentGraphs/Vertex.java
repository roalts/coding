package assignmentGraphs;

import java.util.ArrayList;

public class Vertex {
	String name;
	ArrayList<Edge> adjacentEdges;
	
	public Vertex() {
		adjacentEdges = new ArrayList<Edge>();
	}
	
	public ArrayList<String> getAdjacent() {
		ArrayList<String> output = new ArrayList<String>();
		for (Edge e: adjacentEdges) {
			if (e.firstVertex == this) {
				output.add(e.secondVertex.name);
			} else {
				output.add(e.firstVertex.name);
			}
		}
		return output;
	}
	public void removeEdgeWith(Vertex vertex) {
		for (int i =0; i < adjacentEdges.size(); i++) {
			Edge e = adjacentEdges.get(i);
			if (e.firstVertex == vertex || e.secondVertex == vertex) {
				adjacentEdges.remove(e);
				return;
			}
		}
	}
	
	
	public void addEdge(Edge e) {
		adjacentEdges.add(e);
	}
	
	public int numEdges() {
		return adjacentEdges.size();
	}

	public boolean isAdjacent(Vertex vertex2) {
		for (Edge e : adjacentEdges) {
			if (e.firstVertex == vertex2 || e.secondVertex == vertex2) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Vertex> getAdjacentVertices() {
		ArrayList<Vertex> output = new ArrayList<Vertex>();
		for (Edge e: adjacentEdges) {
			if (e.firstVertex == this) {
				output.add(e.secondVertex);
			} else {
				output.add(e.firstVertex);
			}
		}
		return output;
	}
}
