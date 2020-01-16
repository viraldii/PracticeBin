import javax.swing.JOptionPane;
public class AnnualIncomeExercise {
	
	public static void main (String[]args) {
		
		//Use a input String to store values you have to parse
		String inputS;
		
		//Main storage variables
		String name;
		int age;
		double annualIncome;
		
		//Get name
		name = JOptionPane.showInputDialog("Name: ");
		
		//Get age
		inputS = JOptionPane.showInputDialog("Age:");
		//Parse to Integer
		age = Integer.parseInt(inputS);
		
		//Get desired Pay
		inputS = JOptionPane.showInputDialog("Desired income");
		//Parse to Double
		annualIncome = Double.parseDouble(inputS);
		
		//Output all values given
	JOptionPane.showMessageDialog(null, "My name is " + name + ", my age is "
										+ "and I hope to earn " 
										+ annualIncome + "per year.");
		
		
	}
}
