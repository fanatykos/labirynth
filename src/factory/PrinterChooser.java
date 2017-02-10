package factory;

import java.util.Scanner;

import output.BoardPrinter;
import output.FileBoardPrinter;

public class PrinterChooser {
	private static PrinterChooser instance = null;

	private PrinterChooser() {
	}

	public static synchronized PrinterChooser getInstance() {
		if (instance == null) {
			instance = new PrinterChooser();
		}

		return instance;
	}

	public BoardPrinter choose() {
		System.out.println("Wci�nij 1, aby wy�wietli� labirynt");
		System.out.println("Wci�nij 2, aby zapisa� labirynt do pliku " + FileBoardPrinter.OUTPUT_FILE_NAME);
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
