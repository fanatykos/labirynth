package utils;

import data.Graph;

public class GraphCreator {

	public Graph create(int[][] integerBoard) {
		Graph graph = new Graph();
		for (int i = 0; i < integerBoard.length; i++) {
			for (int j = 0; j < integerBoard[0].length; j++) {
				if (integerBoard[i][j] != -1) {
					createVerticesConnections(graph, integerBoard, i, j);
				}
			}
		}
		
		return graph;
	}

	private boolean createVerticesConnections(Graph graph,
			int[][] integerBoard, int x, int y) {
		if ((y - 1) >= 0 && integerBoard[x][y - 1] != -1) {
			graph.addConnection(integerBoard[x][y], integerBoard[x][y - 1]);
		}
		if ((x - 1) >= 0 && integerBoard[x - 1][y] != -1) {
			graph.addConnection(integerBoard[x][y], integerBoard[x - 1][y]);
		}
		if ((x + 1) < integerBoard.length && integerBoard[x + 1][y] != -1) {
			graph.addConnection(integerBoard[x][y], integerBoard[x + 1][y]);
		}
		if ((y + 1) < integerBoard[0].length && integerBoard[x][y + 1] != -1) {
			graph.addConnection(integerBoard[x][y], integerBoard[x][y + 1]);
		}
		
		return false;
	}
}
