import javax.swing.JOptionPane;
public class BookClubPoints 
{
	public static void main (String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables
		int points;
		int books;
		
		//Welcome user 
		JOptionPane.showMessageDialog(null, "Welcome to "
				+ "Serendipity Books!");
		
		//Get amount of books purchased by the user 
		input = JOptionPane.showInputDialog("How many books "
				+ "do you wish to purchase");
		
		//Parse input
		books = Integer.parseInt(input);
		
		//Determine how many points 
		if(books == 0)
		{
			points = 0;
			JOptionPane.showMessageDialog(null, "No points rewarded for your purchase.");
			System.exit(0);
		}
		else if (books == 1)
		{
			points = 0;
			JOptionPane.showMessageDialog(null, "5 points for your purchase.");
			System.exit(0);
		}
		else if (books == 2)
		{
			points = 0;
			JOptionPane.showMessageDialog(null, "15 points for your purchase.");
			System.exit(0);
		}
		else if (books == 3)
		{
			points = 0;
			JOptionPane.showMessageDialog(null, "30 points for your purchase.");
			System.exit(0);
		}
		else if (books >= 4)
		{
			points = 0;
			JOptionPane.showMessageDialog(null, "60 points for your purchase.");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error in purchase, PLease try again.");
			System.exit(1);
		}
	}
}
