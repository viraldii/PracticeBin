import javax.swing.JOptionPane;
public class StringManipulator {

	public static void main (String[]args) {
		
		/*
		 * In this program we will give back a string 
		 * given by the user with four String commands that we can execute.
		 */
		
		//Input variable
		String input;
		
		//Get user input
		input = JOptionPane.showInputDialog("What is your favorite city: ");
		
		//Determine all commands and print
		JOptionPane.showMessageDialog(null, " 1. " + input + "is " + input.length() + " words long." 
											+ "\n 2. " + input + " in Upper Case: " + input.toUpperCase()
											+ "\n 3. " + input + "in Lower Case: " + input.toLowerCase()
											+ "\n 4. First character of " + input + " is: " + input.charAt(0));
		
	}
}
