package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import data.Graph;

public class GraphPathFinder {

	Graph graph;
	private int[] edgeTo;
	private boolean[] visited;
	private Queue<Integer> priorityQueue;

	public GraphPathFinder(Graph graph) {
		this.graph = graph;
		edgeTo = new int[graph.getNumberOfVertices()];
		visited = new boolean[graph.getNumberOfVertices()];
		priorityQueue = new LinkedList<Integer>();
	}

	public List<Integer> findPathTo(int start, int end) {
		markWhereVertexComesFrom(graph, start);
		List<Integer> path = new ArrayList<>();
		if (!hasThePath(end)) {
			return (ArrayList<Integer>) path;
		}
		for (int w = end; w != start; w = edgeTo[w]) {
			path.add(w);
		}
		path.add(start);
		
		return path;

	}

	private void markWhereVertexComesFrom(Graph graph, int vertex) {
		visited[vertex] = true;
		priorityQueue.offer(vertex);
		while (!priorityQueue.isEmpty()) {
			int v = priorityQueue.poll();
			for (int w : graph.getNeighbourhoodList(v)) {
				if (!visited[w]) {
					edgeTo[w] = v;
					visited[w] = true;
					priorityQueue.offer(w);
				}
			}
		}
	}

	private boolean hasThePath(int wertex) {
		return visited[wertex];
	}

}
