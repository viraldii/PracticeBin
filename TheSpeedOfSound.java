import javax.swing.JOptionPane;
public class TheSpeedOfSound 
{
	public static void main (String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables
		double time;
		double distance;
		
		//Final variables
		final int air = 1100;
		final int water = 4900;
		final int steel = 16400;
	
		//Get whether the sound is traveling through air, water or steel
		input = JOptionPane.showInputDialog("Is the sound traveling through: "
												+ "\n1. Air "
												+ "\n2. Water "
												+ "\n3. Steel");
		//Lower case user input to be able to better determine user choice
		input.toLowerCase();
		
		//If statements to determine course of action
		if(input.equals("air"))
		{
			//Get distance traveled by sound
			input = JOptionPane.showInputDialog("Distance traveled by sound: ");
			
			//Parse input
			distance = Double.parseDouble(input);
			
			//Calculate time
			time = distance / air;
			
			//End Program
			System.exit(0);
		}
		else if (input.equals("water"))
		{
			//Get distance traveled by sound
			input = JOptionPane.showInputDialog("Distance traveled by sound: ");
			
			//Parse input
			distance = Double.parseDouble(input);
			
			//Calculate time
			time = distance / water;
			
			//End Program
			System.exit(0);
		}
		else if (input.equals("steel"))
		{
			//Get distance traveled by sound
			input = JOptionPane.showInputDialog("Distance traveled by sound: ");
			
			//Parse input
			distance = Double.parseDouble(input);
			
			//Calculate time
			time = distance / steel;
			
			//End Program
			System.exit(0);
		}
		
	}
}
