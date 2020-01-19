import javax.swing.JOptionPane;
public class MilesPerGallon {
	
	public static void main (String[]args) {
		
		//String for obtaning user input
		String input;
		
		//Calculation Variables
		double miles;
		double gas;
		double mpg;
		
		//Get user miles
		input = JOptionPane.showInputDialog("Miles Driven:");
		//Parse data
		miles = Double.parseDouble(input);
		
		//Get user gas
		input = JOptionPane.showInputDialog("Gallons used: ");
		//Parse data
		gas = Double.parseDouble(input);
		
		//Calculate MPG
		mpg = miles / gas;
		
		//Print result
		JOptionPane.showMessageDialog(null, "MPG: " + mpg);
	}

}
