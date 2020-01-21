import javax.swing.JOptionPane;
public class StockCommision {
	
	public static void main(String[]args) {
		
		/*
		 * In this program will calculate the amount of a stock purchase
		 * commission to be deducted to the total purchase.
		 */
		
		
		//Static variables
		final String name = " Kathryn";
		final double commission = 0.02;
		final double stockPrice = 21.77;
		final double amountStock = 600;
		
		//Storage variables
		double total1;
		double total2;
		
		
		//Calculate  purchase without commission
		total1 = amountStock * stockPrice;
		//Calculate with commission
		total2 = total1  * commission;

		
		//Print out all of Kathryn's information
		JOptionPane.showMessageDialog(null, name + "\n 1. Amount paid for stocks: " 
										+ total1 + "\n 2. Amount of commission paid: "
										+ total2 + " \n 3. Total with commission paid: " 
										+ (total2 + total1));	
	}

}
