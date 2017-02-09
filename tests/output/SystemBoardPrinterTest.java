package output;

import org.junit.Test;

public class SystemBoardPrinterTest {

	@Test
	public void printTest() {
		char[][] charBoardTest = new char[3][3];
		charBoardTest[0] = new char[] { 'X', 'O', 'X' };
		charBoardTest[1] = new char[] { 'O', 'O', 'X' };
		charBoardTest[2] = new char[] { 'O', 'S', 'E' };
		BoardPrinter printer = new SystemBoardPrinter();
		printer.print(charBoardTest);
	}

}
