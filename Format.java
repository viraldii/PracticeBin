package CopyPracticeCode;
import java.text.DecimalFormat;
import java.util.Formatter;

import javax.swing.JOptionPane;
public class Format 
{
	/*
	 * This program introduces the use of formating decimal 
	 * numbers to a desired length.
	 */
	
	public static void main (String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables for numbers
		double number1;
		double number2;
		double number3;
		
		//Create a formatter.
		DecimalFormat formatter = new DecimalFormat("#0.000");
		
		//Get three numbers 
		input = JOptionPane.showInputDialog("Input a decimal number: ");
		//Parse number given
		number1 = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Input a decimal number: ");
		//Parse number given
		number2 = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Input a decimal number: ");
		//Parse number given	
		number3 = Double.parseDouble(input);
		
		//Print numbers in a formated manner
		System.out.println(formatter.format(number1));

		System.out.println(formatter.format(number2));

		System.out.println(formatter.format(number3));

	
		
	}
}
