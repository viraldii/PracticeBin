package CopyPracticeCode;

import javax.swing.JOptionPane;
public class UserSquares 
{
	public static void main (String[]args)
	{
		String input;	//user input variable
		
		//Storage
		int number;		//loop control variable
		int maxValue;	//maximum value to display
		
		//Inform user of programs function
		JOptionPane.showMessageDialog(null, "I will display a table of "
				+ "numbers and their squares");
		
		//Get max number
		input = JOptionPane.showInputDialog("Insert max number for table: ");
		//Parse user input
		maxValue = Integer.parseInt(input);
		
		//Draw table
		System.out.println("Number /t /t Number Squared: ");
		System.out.println("------------------------------");
		
		//For loop to run and calculate all squared numbers
		for(number = 1; number <= maxValue; number++)
		{
			System.out.println(number + "\t \t" + (number * number));
		}
		
	}
}
