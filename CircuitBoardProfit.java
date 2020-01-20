import javax.swing.JOptionPane;
public class CircuitBoardProfit {

	public static void main (String[]args) {
		
		/*
		 * Determen how much profit there is with
		 * consumer products by calculating:
		 * 
		 * 		Profit = Retail * 0.4	
		 */
	
		//Input variable
		String input;
		
		//final value for profit margin at 40%
		final double profitMargin = 0.4;
		
		//Storage variables
		double profit;
		double retail;
		
		//Get information from user
		input = JOptionPane.showInputDialog("What is the retail price of the circuit board: ");
		//Parse user data to double
		retail = Double.parseDouble(input);
		
		//Calculate profit margin 
		profit = retail * profitMargin;
		
		//Give calculation to user
		JOptionPane.showMessageDialog(null, "The profit margin for the circuit board is: " 
											+ profit);
	}
}
