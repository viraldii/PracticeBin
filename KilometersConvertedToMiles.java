package codePrac;
import javax.swing.JOptionPane;
public class KilometersConvertedToMiles 
{
	public static void main(String[]args)
	{
		
		//Storage Inputs
		int counter;	//Counter represents KPH, MPH and the counter for the loop
		
		//Final variables for precise calculations in the conversion
		final double converter = 0.6214;
		
		//Welcome and inform user of function
		JOptionPane.showMessageDialog(null, "Welcome, with this program you will \n"
				+ "be able to determine how many miles \n"
				+ "per hour you are going  by \n"
				+ "converting the kilometers into miles.");
		
		//Draw table
		System.out.println("KPH \t \t MPH");
		System.out.println("_______________________");	
		
		//For loop to determine conversion of KPH to MPH
		for(counter = 60; counter <= 130; counter = counter + 10)
		{
			System.out.println(counter + "\t \t " + (counter * converter));
		}
	}
}
