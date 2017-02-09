package input;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileInputTest {

	@Test
	public void readBoardFromFileTestFileIsNotExists() {
		String fileName = "fileIsNotExistsTest.txt";
		FileInput fileInput = new FileInput();
		char[][] readedBoard = fileInput.readFromFile(fileName);
		assertFalse(readedBoard != null);
	}

	@Test
	public void readBoardFromFileTestPositive() {
		String fileName = "fileNameTest.txt";
		FileInput fileInput = new FileInput();
		char[][] readedBoard = fileInput.readFromFile(fileName);
		assertTrue(readedBoard[6][2] == 'G');
	}

}
