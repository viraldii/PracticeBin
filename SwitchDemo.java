package CopyPracticeCode;
import javax.swing.JOptionPane;
public class SwitchDemo 
{
	public static void main (String[]args)
	{
		
		//Storage variable
		int number;
		//Input variable
		String input;
		
		//Get one of the numbers 1, 2, 3
		input = JOptionPane.showInputDialog("Please write a number from 1 to 3");
		//Parse user Input
		number = Integer.parseInt(input);
		
		switch (number)
		{
		case 1:
			JOptionPane.showMessageDialog(null, "You entered 1.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You entered 2.");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "You entered 3.");
		break;
		default: 
			JOptionPane.showMessageDialog(null, "That's not 1, 2, or 3.");
		break;
		}
		
	}
}
