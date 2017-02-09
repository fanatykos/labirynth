package factory;

import java.util.Scanner;

import output.BoardPrinter;
import output.FileBoardPrinter;

public class PrinterChooser {
	private static PrinterChooser printChooser = null;

	private PrinterChooser() {
	}

	public static synchronized PrinterChooser getInstance() {
		if (printChooser == null) {
			printChooser = new PrinterChooser();
			return printChooser;
		}
		return printChooser;
	}

	public BoardPrinter choose() {
		System.out.println("Wciœnij 1, aby wyœwietliæ labirynt");
		System.out.println("Wciœnij 2, aby zapisaæ labirynt do pliku "
				+ FileBoardPrinter.OUTPUT_FILE_NAME);
		String choosedNumber = "";
		Scanner input = new Scanner(System.in);
		BoardPrinterFactory boardPrinterFactory = new BoardPrinterFactory();
		try {
			while (true) {
				choosedNumber = input.nextLine();
				switch (choosedNumber) {
				case "1":
					return boardPrinterFactory.createSystemBoardPrinter();
				case "2":
					return boardPrinterFactory.createFileBoardPrinter();
				}
			}
		} finally {
			input.close();
		}
	}
}
