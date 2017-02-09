package utils;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BoardConverterTest {

	@Test
	public void convertToIntegerBoardTest() {
		char[][] charBoardTest = new char[3][3];
		charBoardTest[0] = new char[] { 'X', 'O', 'X' };
		charBoardTest[1] = new char[] { 'O', 'O', 'X' };
		charBoardTest[2] = new char[] { 'O', 'S', 'E' };
		int[][] integerBoard = new int[3][3];
		integerBoard[0] = new int[] { -1, 0, -1 };
		integerBoard[1] = new int[] { 1, 2, -1 };
		integerBoard[2] = new int[] { 3, 4, 5 };
		BoardConverter boardConverter = new BoardConverter();
		assertTrue(boardConverter.convert(charBoardTest)[2][2] == integerBoard[2][2]);
	}
	
	@Test
	public void convertToCharBoardTest() {
		int[][] integerBoard= new int[3][3];
		integerBoard[0] = new int[] { -1, 0, -1 };
		integerBoard[1] = new int[] { -1, 1, 2 };
		integerBoard[2] = new int[] { 3, 4, -1 };
		List<Integer> list= new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(0);
		BoardConverter boardConverter = new BoardConverter();
		char[][] resultBoard= boardConverter.convert(integerBoard, list);
		assertTrue(resultBoard[0][1] =='S');
		assertTrue(resultBoard[2][0] == 'E');
		assertTrue(resultBoard[1][1] == (char) 176);
	}

}
