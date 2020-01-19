import javax.swing.JOptionPane;
public class LandCalculation {

	public static void main(String[]agrs) {
		
		/*
		 * This program will calculate the amount of acres when the square footage is already final.
		 * This will later be displayed in a message box
		 */
		
		//Variables are final because they where specified in the programming challenge and 
		//dont need to be changed.
		final int oneAcre = 43560;
		final int tractOfLand = 389767;
		
		int total = tractOfLand / oneAcre;
		
		JOptionPane.showMessageDialog(null, tractOfLand + " square feet is equivalent to " + total + " acres." );
		
	}
}
