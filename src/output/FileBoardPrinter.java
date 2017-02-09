package output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBoardPrinter implements BoardPrinter {
	public static final String OUTPUT_FILE_NAME = "output.txt";

	@Override
	public void print(char[][] charBoard) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME, true));
			for (int i = 0; i < charBoard.length; i++) {
				for (int j = 0; j < charBoard[0].length; j++) {
					writer.write(charBoard[i][j]);
					writer.write(' ');
				}
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}