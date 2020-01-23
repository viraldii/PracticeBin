package CopyPracticeCode;
import javax.swing.JOptionPane;
public class Solutions {

	public static void main (String[]args) {
		
		//Input variable
		String input;
		
		//Storage variable
		int num;
		
		input = JOptionPane.showInputDialog("Input number between 1 aand 100: ");
		//Parse users input
		num = Integer.parseInt(input);
		
		//Confirming number is between 1 and a 100
		if(num > 1 && num < 100) 
		{
			
			//Confirm if number is odd
			if (num  %2 != 0) 
			{
				System.out.println("Weird");
			}
			//Confirming condition #1: 
			//N is even and between 2 and 5
			else if (num >= 2 && num <= 5) 
			{
				
				//Confirm num is even 
				if (num %2 == 0) 
				{
					System.out.println("Not Weird");
				}
			}
			
			//Confirming condition #2
			//N is even and between 6 and 20
			else if (num >= 6 && num <= 20)
			{
				
				//Confirm num is even
				if (num %2 == 0) 
				{
					System.out.println("Weird");
				}
			}
			//Confirming condition %3
			else if (num > 20)
			{
				
				//Confirming num is even
				if(num %2 == 0) 
				{
					System.out.print("Not Weird");
				}
			}
			
		}
		else
			System.out.println("Number need to be between 1 and 100");
	}
	
}
