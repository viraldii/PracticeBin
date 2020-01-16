import javax.swing.JOptionPane;
import java.util.Scanner;
public class NameAndInitials {

	/*
	 * In this program we will get the initials of the user and present them back 
	 * after all variables have been filled.
	 */
	public static void main (String[]args) {
		
		String input; 
		char firstInitial;
		char middleInitial;
		char lastInitial;
		
		//Getting the value in String
			input = JOptionPane.showInputDialog("First Initial: ");
		//Using charAt(0) for the String allows us to get the first letter at the 0 mark
			firstInitial = input.charAt(0);
		
		//Getting the value in String
			input = JOptionPane.showInputDialog("Middle Initial: ");
		//Using charAt(0) for the String allows us to get the first letter at the 0 mark 
			middleInitial = input.charAt(0);
		
		//Getting the value in String
				input = JOptionPane.showInputDialog("Last Initial: ");
		//Using charAt(0) for the String allows us to get the first letter at the 0 mark 
				lastInitial = input.charAt(0);
				
		//Print users Initials
				JOptionPane.showMessageDialog(null, "Your Initials are: " 
													+ firstInitial + ". " + 
													middleInitial + ". " 
													+ lastInitial + ".");
				
		
		
	}
}
