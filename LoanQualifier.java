package CopyPracticeCode;
import javax.swing.JOptionPane;
public class LoanQualifier {
	
	public static void main (String[]args) {
		
		//Storage Variable
		double salary;
		double yearsOnJob;
		String input;
		
		//Get the user's annual salary.
		input = JOptionPane.showInputDialog("Enter your " + 
											"annual salary.");
		salary = Double.parseDouble(input);
		
		//Get years on the job
		input = JOptionPane.showInputDialog("Enter number " +
											"of years on current job.");
		yearsOnJob = Double.parseDouble(input);
		
		//Determine whether the user qualifies for the loan.
		if (salary >= 30000)
		{
			if(yearsOnJob >= 2)
			{
				JOptionPane.showMessageDialog(null, "Congrats you get the loan.");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Im sorry, you need to be "
									+ "in your current job for at least 2 years.");
			}
		}
		else 
		{
		JOptionPane.showMessageDialog(null, "Im sorry, you need to earn at least 30,000.");
		}
	}
}
