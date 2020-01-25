package CopyPracticeCode;
import javax.swing.JOptionPane;
public class TestResults {
	
	public static void main (String []args) {
		
		//Store user input
		int testScore;
		//Get user input
		String input;
		
		//Get users test score
		input = JOptionPane.showInputDialog("Please insert your test score: ");
		//Parse String into int
		testScore = Integer.parseInt(input);
		
		//If and else if statements that determine what to send the user
		if(testScore < 60) 
		{
			JOptionPane.showMessageDialog(null, "Your grade is an F.");
		}
		else if (testScore < 70) 
		{
			JOptionPane.showMessageDialog(null, "Your grade is D.");
		}
		else if (testScore < 80)
		{
			JOptionPane.showMessageDialog(null, "Your grade is C.");
		}
		else if (testScore < 90)
		{
			JOptionPane.showMessageDialog(null, "Your grade is B.");
		}
		else if (testScore <= 100)
		{
			JOptionPane.showMessageDialog(null, "Your grade is A+");
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid Score.");
		
		//Program Termination
		System.exit(0);
	}
}
