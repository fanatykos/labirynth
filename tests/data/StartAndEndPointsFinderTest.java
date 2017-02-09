package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class StartAndEndPointsFinderTest {

	@Test
	public void findStartAndEndTest() {
		char[][] charBoardTest = new char[3][3];
		charBoardTest[0] = new char[] { 'X', 'O', 'S' };
		charBoardTest[1] = new char[] { 'O', 'O', 'X' };
		charBoardTest[2] = new char[] { 'O', 'O', 'E' };
		int[][] integerBoard = new int[3][3];
		integerBoard[0] = new int[] { 1, 2, 3 };
		integerBoard[1] = new int[] { 4, 5, 6 };
		integerBoard[2] = new int[] { 7, 8, 9 };
		StartAndEndVerticesFinder startAndEnd = new StartAndEndVerticesFinder();
		startAndEnd.findStartAndEnd(charBoardTest, integerBoard);

		assertTrue(startAndEnd.getStart() == 3);
		assertTrue(startAndEnd.getEnd() == 9);

	}
}
