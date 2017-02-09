package utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import data.Graph;

public class GraphCreatorTest {

	@Test
	public void createGraphAndConnectionsTest() {
		int[][] integerBoard = new int[3][3];
		integerBoard[0] = new int[] { -1, 0, -1 };
		integerBoard[1] = new int[] { -1, 1, 2 };
		integerBoard[2] = new int[] { 3, 4, -1 };
		GraphCreator graphCreator = new GraphCreator();
		Graph graph= graphCreator.create(integerBoard);
		System.out.println(graph.toString());
		List<Integer> neighbours1 = new ArrayList<>();
		neighbours1.add(0);
		neighbours1.add(4);
		neighbours1.add(2);
		assertTrue(graph.getNeighbourhoodList(1).equals(neighbours1));
	}

}
