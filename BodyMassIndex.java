import javax.swing.JOptionPane;
public class BodyMassIndex 
{
	public static void main(String[]args)
	{
		//Input variable
		String input;
		
		//Storage variables 
		double  bmi;
		double weight;		//POUNDS
		double height;		//INCHES
		
		//Get user height 
		input = JOptionPane.showInputDialog("Insert height");
		
		//Parse input 
		height = Double.parseDouble(input);
		
		//Verify that user input is valid
		if(height > 108	 || height < 10) 
			{
				JOptionPane.showMessageDialog(null, "Height too big", "ERROR!"
												, 0, null);
				System.exit(0);
			}
		
		//Get user weight
		input = JOptionPane.showInputDialog("Insert weight");
		
		//Parse input
		weight = Integer.parseInt(input);
		
		//Verity that user input is valid
		if(weight > 600 || weight < 50)
			{
				JOptionPane.showMessageDialog(null, "Weight is too much", 
												"Error", 0, null);
				System.exit(0);
			}
		
		//Determine BMI
		bmi = (weight * 703) / (height * height);
		
		//Determine what classification of weight user is.
		if(bmi <= 18.5)
			{
				JOptionPane.showMessageDialog(null, "You are underweight");
			}
		else if (bmi >= 25.0)
			{
				JOptionPane.showMessageDialog(null, "You are overweight");
			}
		else
				JOptionPane.showMessageDialog(null, "You are at an optimal weight");
		
	}
}
