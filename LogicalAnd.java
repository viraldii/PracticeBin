package CopyPracticeCode;
import javax.swing.JOptionPane;
public class LogicalAnd {

	public static void main (String []args) {
		
		//Storage Variables
		double salary;
		double yearsOnJob;

		//Input Variable
		String input;
		
		//Get users annual salary
		input = JOptionPane.showInputDialog("Enter your"
										+ "annual salary: ");
		
		//pParse user input
		salary = Double.parseDouble(input);
		
		//Get user years on job
		input = JOptionPane.showInputDialog("Enter years on job: ");
		
		//Parse user input
		yearsOnJob = Double.parseDouble(input);
		
		//Determine whether user qualifies for the loan
		if(salary >= 50000 && yearsOnJob >= 2.0)
		{
			System.out.println("Cngratulations, you got the loan approved!");
		}
		else 
			System.out.println("Im sorry, your loan was not approved.");
	}
}
