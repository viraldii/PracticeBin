import javax.swing.JOptionPane;
public class PayrollDialog {
	
	public static void main (String[]args) {
		
		
		String inputString; 	//For reading input that is not s
		String name; 			//User's Name
		int hours; 				//User's hours
		double payRate; 		// User's Payroll 
		double grossPay; 		//User's total pay
		
		//Get user's name 
		name = JOptionPane.showInputDialog("New Login: ");
		
		//Get user's payroll
				inputString = JOptionPane.showInputDialog("Pay per hour: ");
		//Parse String to Double 
				payRate = Double.parseDouble(inputString);
		
		//Get user's hours worked
				inputString = JOptionPane.showInputDialog("Input hours worked: ");
		//Parse the String to Integer
				hours = Integer.parseInt(inputString);
		
		//Calculate users Gross Pay
				grossPay = hours * payRate;
		
		//Print users check
				JOptionPane.showMessageDialog(null, name + "your check is of: " + grossPay);
				
		//End Program
		System.exit(0);
			
		
		
		
	}

}
