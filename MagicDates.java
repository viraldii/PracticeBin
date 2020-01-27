import javax.swing.JOptionPane;
public class MagicDates 
{
	/*
	 * In this program user will give a full date and we will determine if the multiplication of the month along with the
	 * day equals the year. If so we will inform the user that the date is indeed a special date rather than 
	 * a regular one.
	 */
	public static void main (String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables 
		int month = 0;
		int day = 0;
		int year = 0;
		
		//Get user Month
		input = JOptionPane.showInputDialog("Insert month numerically");
		//If statement to detect if user inserted month in the correct manner
				if(input.length() > 2)
				{
					JOptionPane.showMessageDialog(null, "Please insert month in the following "
							+ "format: \n 01, 02, 03, ect.", "ERROR!", month);
					System.exit(0);
				}	
		//Parse value
		month = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Insert day numerically:");
		//If statement to detect if user inserted day in the correct manner
				if(input.length() > 2)
				{
					JOptionPane.showMessageDialog(null, "Please insert day in the "
							+ "following format: \n 01, 02, 03, ect.", "ERROR!", day);
					System.exit(0);
				}
		//Parse value
		day = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Insert year numerically");
		//If statement to detect if user inserted year in the correct manner
				if(input.length() > 2)
				{
					JOptionPane.showMessageDialog(null, "Please insert year in the following format: \n 01, 02, 03, ect.", "ERROR!", month);
					System.exit(0);
				}
		//Parse value
		year = Integer.parseInt(input);
		
		//Determine if the date given is special
		if ((month * day) == year) 
		{
			System.out.printf("%d/%d/%d is a special date", month, day, year);
		}
		else
		{
			System.out.printf("%d/%d/%d is NOT a special date", month, day, year);

		}
		
		
		
		
		
	}
}
