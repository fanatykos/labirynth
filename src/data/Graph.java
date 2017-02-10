package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private int numberOfEdges;
	private Map<Integer, List<Integer>> graphList;

	public Graph() {
		this.numberOfEdges = 0;
		this.graphList = new HashMap<Integer, List<Integer>>();
	}

	public void addConnection(int a, int b) {
		if (graphList.get(a) == null) {
			graphList.put(a, new ArrayList<Integer>());
		}
		graphList.get(a).add(b);
		numberOfEdges++;
	}

	public int getNumberOfVertices() {
		return graphList.size();
	}

	public int getNumberOfEdges() {
		return numberOfEdges / 2;
	}

	public Iterable<Integer> getNeighbourhoodList(int vertex) {
		return graphList.get(vertex);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Liczba wierzcho�k�w w grafie: ")
				.append(getNumberOfVertices()).append(", liczba kraw�dzi: ")
				.append(getNumberOfEdges()).append("\n");
		for (int i = 0; i < graphList.size(); i++) {
			result.append("Wierzcho�ek: ").append(i)
					.append(", posiada po��czenia z wierzcho�kami: ")
					.append(getNeighbourhoodList(i)).append("\n");
		}
		
		return result.toString();
	}
}
