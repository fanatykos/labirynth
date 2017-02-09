package factory;

import output.BoardPrinter;
import output.FileBoardPrinter;
import output.SystemBoardPrinter;

public class BoardPrinterFactory {

	public BoardPrinter createSystemBoardPrinter() {
		return new SystemBoardPrinter();
	}

	public BoardPrinter createFileBoardPrinter() {
		return new FileBoardPrinter();
	}
}
