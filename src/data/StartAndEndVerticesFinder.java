package data;

import utils.BoardConverter;

public class StartAndEndVerticesFinder {

	private int start;
	private int end;
	
	public void findStartAndEnd(char[][] charBoard, int[][] integerBoard) {
		for (int i = 0; i < charBoard.length; i++) {
			for (int j = 0; j < charBoard[0].length; j++) {
				if (charBoard[i][j] == BoardConverter.START_CHAR) {
					this.start= integerBoard[i][j];
				} else if (charBoard[i][j] == BoardConverter.END_CHAR) {
					this.end = integerBoard[i][j];
					
				}
			}
		}
	}

	public int getStart() {
		return start;
	}

	public int getEnd(){
		return end;
	}

}
