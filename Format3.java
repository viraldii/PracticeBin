package CopyPracticeCode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Format3 
{
	
	/*
	 * In this program we establish that you can add commas to printed numbers 
	 * by making the decimal formatter specifically to format with the commas 
	 * integrated.
	 */
	
	public static void main(String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables
		double number1;
		double number2;
		double number3;
		
		//Create format device
		DecimalFormat formatter = new DecimalFormat ("#,##0.00");
		
		//Get user input
		input = JOptionPane.showInputDialog("Insert Number:");
		
		//Parse input
				number1 = Double.parseDouble(input);
				
		input = JOptionPane.showInputDialog("Insert Number:");
		
		//Parse input
				number2 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Insert Number:");
		
		//Parse input
				number3 = Double.parseDouble(input);
				
		//Print numbers in formatted manner
				System.out.println(formatter.format(number1));
				
				System.out.print(formatter.format(number2));
				
				System.out.println(formatter.format(number3));
	}
}
