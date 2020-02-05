package CopyPracticeCode;
import javax.swing.JOptionPane;
public class WhlieLoop 
{
	public static void main (String[]args)
	{
		int number = 1;
		
		while (number <= 5)
		{
			JOptionPane.showMessageDialog(null, "Hello");
			number++;
		}
		
		JOptionPane.showMessageDialog(null, "End");
	}
}
