import javax.swing.JOptionPane;
public class TestAverage {
	
	public static void main (String []args) {
		
		/*
		 * This program will get 3 data inputs from the user and will calculate the average 
		 * of the three then print it back to the user along with all of the three scores.
		 * 
		 */
		
		//Variable for user input
		String input;
		
		//Variables storing user data
		double test1;
		double test2;
		double test3;
		
		double total;
		
		// Get test #1
		input = JOptionPane.showInputDialog("Test score #1: ");
		//Parse input
		test1 = Double.parseDouble(input);
		
		//Get test #2
		input = JOptionPane.showInputDialog("Test score #2: ");
		//Parse input
		test2 = Double.parseDouble(input);
		
		//Get test #3
		input = JOptionPane.showInputDialog("Test Score #3: ");
		//Parse input
		test3 = Double.parseDouble(input);
		
		//Calculate Average
		total = (test1 + test2 + test3) / 3.0; 
		
		//Print back user data and average
		JOptionPane.showMessageDialog(null, "Ÿour test scores are: \n 1. " + test1 + 
											"\n 2. " + test2  + "\n 3." + 
											test3 + "\n Grand total: " 
												+ total);
		
	}

}
