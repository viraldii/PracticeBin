import javax.swing.JOptionPane;
public class LoopChallenge 
{
	public static void main (String[]args)
	{
		//String input
		String input;
		
		//Storage input
		double number;		//Store number given by user
		double multi = 1;	//Multiplier for the loop
		double total; 		//Store total of multiplication
		
		//Inform the user of what the program does.
		JOptionPane.showMessageDialog(null, "Welcome! \n"
				+ "In this program you will submit \n"
				+ "a number and we will determine its \n"
				+ "first 10 multiples.");
		
		//Get user input 
		input = JOptionPane.showInputDialog("Insert number: ");
		//Parse input
		number = Double.parseDouble(input);
		
		//Calculate all multiples and display them
		while(multi < 11)
		{
			total = number * multi;
			System.out.println(number + " * " + multi + " = " + total);
			multi++;
		}
		
	
	} 
}
