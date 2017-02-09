package factory;

import org.junit.Test;

import output.BoardPrinter;
import factory.PrinterChooser;

public class PrinterChooserTest {

	@Test
	public void chooseTest() {
		BoardPrinter result = PrinterChooser.getInstance().choose();
		System.out.println(result.getClass().toString());
	}

}
