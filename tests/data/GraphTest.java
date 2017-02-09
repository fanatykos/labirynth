package data;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GraphTest {

	@Test
	public void addConnectionTest() {
		Graph graph= new Graph();
		List<Integer> neighbours= new ArrayList<Integer>();
		neighbours.add(2);
		neighbours.add(4);
		neighbours.add(6);
		neighbours.add(8);
		graph.addConnection(1, 2);
		graph.addConnection(1, 4);
		graph.addConnection(1, 6);
		graph.addConnection(1, 8);
		
		assertTrue(graph.getNeighbourhoodList(1).equals(neighbours));
	}

}
