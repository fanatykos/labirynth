package utils;

import java.util.Arrays;
import java.util.List;

public class BoardConverter {
	public final static char START_CHAR = 'S';
	public final static char END_CHAR = 'E';
	final static char EMPTY_CHAR = 'O';
	
	final static char RESULT_PATH_CHAR = (char) 176;
	final static char RESULT_FREE_SPACE_CHAR = ' ';
	final static char RESULT_OCCUPIED_SPACE_CHAR = 'X';
	
	public int[][] convert(char[][] charBoard) {
		int[][] integerBoard = new int[charBoard.length][charBoard[0].length];
		for (int k = 0; k < integerBoard.length; k++) {
			Arrays.fill(integerBoard[k], -1);
		}
		int index = 0;
		for (int i = 0; i < integerBoard.length; i++) {
			for (int j = 0; j < integerBoard[0].length; j++) {
				if (charBoard[i][j] == START_CHAR
						|| charBoard[i][j] == EMPTY_CHAR
						|| charBoard[i][j] == END_CHAR) {
					integerBoard[i][j] = index;
					index++;
				}
			}
		}
		return integerBoard;
	}

	
	public char[][] convert(int[][] integerBoard, List<Integer> list) {
		char[][] resultCharBoard = new char[integerBoard.length][integerBoard[0].length];
		for (int i = 0; i < resultCharBoard.length; i++) {
			for (int j = 0; j < resultCharBoard[0].length; j++) {
				if (belongsToList(list, integerBoard[i][j])) {
					resultCharBoard[i][j] = RESULT_PATH_CHAR;
				} else if (integerBoard[i][j] != -1) {
					resultCharBoard[i][j] = RESULT_FREE_SPACE_CHAR;
				} else {
					resultCharBoard[i][j] = RESULT_OCCUPIED_SPACE_CHAR;
				}
				if (integerBoard[i][j] == list.get(0)) {
					resultCharBoard[i][j] = END_CHAR;
				} else if (integerBoard[i][j] == list.get(list.size() - 1)) {
					resultCharBoard[i][j] = START_CHAR;
				}
			}
		}
		return resultCharBoard;
	}

	private boolean belongsToList(List<Integer> list, int number) {
		for (int i = 1; i < (list.size() - 1); i++) {
			if (number == list.get(i)) {
				return true;
			}
		}
		return false;
	}

	
}