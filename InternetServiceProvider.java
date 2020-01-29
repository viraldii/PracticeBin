import javax.swing.JOptionPane;
public class InternetServiceProvider 
{
	public static void main (String[]args)
	{
		//Input / Storage variable
		String input;
		String pack;
		
		//Storage variable
		double hours;
		double fee = 0;
		double total = 0;
		
		//Inform user of packages and get their desired package
		pack = JOptionPane.showInputDialog("Package A: ($9.95m) for ten hours "
											+ "\n Additional hours $2.00 "
											+ "\nPackage B: ($13.95m) for twenty hours "
											+ "\n Additional hours $1.00"
											+ "\nPackage C: ($19.95m) Unlimited access provided."); 
		
		//Get the first char from the string to determine that package the user has chosen
		pack.charAt(0);
		//UpperCase Char valuable retrieved
		pack.toUpperCase();
		
		//Switch case to determine package
		switch (pack)
		{
		case "A":
			input = JOptionPane.showInputDialog("Insert Hours: ");
			hours = Double.parseDouble(input);
			 if(hours > 10)
			 {
				 while(hours > 10) 
				 {
					 fee = fee + 2.00;
					 hours--;
				 }
			 }
			 total = 9.25 + fee;
			 JOptionPane.showMessageDialog(null, "Your total is: $" 
					 							+ total);;
			 break;
		case "B":
			input = JOptionPane.showInputDialog("Insert Hours: ");
			hours = Double.parseDouble(input);
			 if(hours > 20)
			 {
				 while(hours > 20) 
				 {
					 fee = fee + 1.00;
					 hours--;
				 }
			 }
			 total = 13.95 + fee;	 
			 JOptionPane.showMessageDialog(null, "Your total is: $" 
					 							+ total);;
			 break;
		case "C":
			JOptionPane.showMessageDialog(null, "Your total is $19.95");
			break;
			
		}
	}
}