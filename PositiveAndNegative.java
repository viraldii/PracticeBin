import javax.swing.JOptionPane;
public class PositiveAndNegative
{
	public static void main (String[]args)
	{
		//Storage variable
		String input;
		
		//Storage variables 
		int positive = 0;	//amount of negatives given by user 
		int negative = 0;	//amount of positives given by user
		
		double number;	//Number given by user in loop
		
		char answer = 'y';	//determines to whether continue program or end and display amount of + and -
		
		
		//Welcome user and inform of program user
		JOptionPane.showMessageDialog(null, "Welcome! \n"
				+ "In this program you will give how many\n"
				+ "numbers you want to submit and in the \n"
				+ "end we will display how many where \n"
				+ "positive or negatives.");
		
		
		do
		{
			//Get user input
			input = JOptionPane.showInputDialog("Insert any number: ");
			//Parse input
			number = Double.parseDouble(input);
			
			//Determine if number is positive or negative and add to respective storage 
			//to account for user's amount of + and -
			if(number > 0)
			{
				positive ++;
			}
			else
			{
				negative ++;
			}
			
			//Ask user to continue 
			input = JOptionPane.showInputDialog("Do you wish to submit another number");
			//Parse value to char
			answer = input.charAt(0);
			
		} while (answer == 'y' || answer == 'Y');
		
		//Display how many negative and positives user submitted
		JOptionPane.showMessageDialog(null, "You sumbitted a total of: \n"
				+ positive + " positive numbers \n"
				+ negative + " negative numbers");
	}
}
