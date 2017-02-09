package input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput {

	public char[][] readFromFile(String fileName) {
		List<char[]> readedList = new ArrayList<char[]>();
		char[][] charTable = null;

		try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
			String currentLine;
			while ((currentLine = input.readLine()) != null) {
				readedList.add(currentLine.toCharArray());
			}
			charTable = readedList
					.toArray(new char[readedList.size()][readedList.get(0).length]);
		} catch (FileNotFoundException e) {
			System.err.println("Podany plik nie istnieje");
		} catch (IOException e) {
			System.err.println("B³¹d odczytu danych");
		}
		return charTable;
	}
}