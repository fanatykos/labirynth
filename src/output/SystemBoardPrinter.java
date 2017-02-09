package output;

public class SystemBoardPrinter implements BoardPrinter {
		
	@Override
	public void print(char[][] charBoard) {
		for (int i = 0; i < charBoard.length; i++) {
			for (int j = 0; j < charBoard[0].length; j++) {
				System.out.print(charBoard[i][j] + " ");
			}
			System.out.println();
		}
	}
}
