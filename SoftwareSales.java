import javax.swing.JOptionPane;
public class SoftwareSales 
{
	/*
	 * This program will receive the amount of software purchases the user wants
	 * and give the user a specific amount of discount for the amount
	 * requested
	 */
	public static void main (String[]args)
	{
		//Input variable
		String input;
		
		//Final variable
		final int price = 99;
		
		//Storage variables 
		int purchaseAmount;
		
		//Inform the user of discounts
		JOptionPane.showMessageDialog(null, "Discounts are as follows: "
										+ "\n10-19     20%"
										+ "\n20-49     30%"
										+ "\n50-99     40%"
										+ "\n100+       50%");
		
		//Determine the amount the user wants to purchase
		input = JOptionPane.showInputDialog("Amount to be purchased: ");
		//Parse input
		purchaseAmount = Integer.parseInt(input);
		
		//Determine discount
		if(purchaseAmount >= 10 && purchaseAmount <= 19)
		{
			JOptionPane.showMessageDialog(null, "Your total is $" 
												+ ((price * 20) /100) + " with a %20");
												System.exit(0);
		}
		
		else if(purchaseAmount >= 20 && purchaseAmount <= 49)
		{
			JOptionPane.showMessageDialog(null, "Your total is $" 
												+ ((price * 30) /100) 
												+ " with a %30");
												System.exit(0);
		}
		
		else if(purchaseAmount >= 50 && purchaseAmount <= 99)
		{
			JOptionPane.showMessageDialog(null, "Your total is $" 
												+ ((price * 40) /100) 
												+ " with a %40");
												System.exit(0);
		} 
		
		else
		{
			JOptionPane.showMessageDialog(null, "Your total is $" 
												+ ((price * 50) /100) 
												+ " with a %50");
												System.exit(0);
		}
		
	}
}
