package CopyPracticeCode;
import javax.swing.JOptionPane;
public class StringCompare 
{
	
	public static void main (String[]args) 
	{
		
		/*
		 * This programs focus is to get the user to give two names and check if they are indeed the same.
		 */
		
		//Storage Variables
		String name1;
		String name2;
		
		//Get the user's first name to insert
		name1 = JOptionPane.showInputDialog("First name "
				+ "to compare: ");
		
		//Parse the value given
		name2 = JOptionPane.showInputDialog("Second name "
				+ "to compare: ");
		
		if(name1.contentEquals(name2))
		{
			System.out.println("Names are the same.");
		}
		else
		{
			System.out.println("Names are NOT the same.");
		}
	}

}
