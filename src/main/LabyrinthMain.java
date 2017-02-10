package main;

import input.FileInput;

import java.util.ArrayList;

import output.BoardPrinter;
import utils.BoardConverter;
import utils.GraphCreator;
import utils.GraphPathFinder;
import data.Graph;
import data.StartAndEndVerticesFinder;
import factory.PrinterChooser;

public class LabyrinthMain {
	public static void main(String[] args) {
		final String FILE_NAME = "input.txt";

		FileInput fileInput = new FileInput();
		char[][] readedCharBoard = fileInput.readFromFile(FILE_NAME);

		BoardConverter boardConverter = new BoardConverter();
		int[][] integerBoard = boardConverter.convert(readedCharBoard);

		StartAndEndVerticesFinder startAndEnd = new StartAndEndVerticesFinder();
		startAndEnd.findStartAndEnd(readedCharBoard, integerBoard);

		GraphCreator graphCreator = new GraphCreator();
		Graph graph = graphCreator.create(integerBoard);

		GraphPathFinder graphFinder = new GraphPathFinder(graph);
		ArrayList<Integer> path = (ArrayList<Integer>) graphFinder.findPathTo(
				startAndEnd.getStart(), startAndEnd.getEnd());

		char[][] resultCharBoard = boardConverter.convert(integerBoard, path);

		BoardPrinter boardPrinter = PrinterChooser.getInstance().choose();
		boardPrinter.print(resultCharBoard);
	}
	
}
