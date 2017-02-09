package output;

import org.junit.Test;

public class FileBoardPrinterTest {

	@Test
	public void printCharBoardTest() {
		char[][] charBoardTest = new char[3][3];
		charBoardTest[0] = new char[] { 'X', 'O', 'X' };
		charBoardTest[1] = new char[] { 'O', 'O', 'X' };
		charBoardTest[2] = new char[] { 'O', 'S', 'E' };
		FileBoardPrinter printer = new FileBoardPrinter();
		printer.print(charBoardTest);
	}
}
