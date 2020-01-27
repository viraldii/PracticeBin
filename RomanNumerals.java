import javax.swing.JOptionPane;	
public class RomanNumerals 
{
	/*
	 * User will write a number between 1 and 10 and the program will give back the number 
	 * in roman numerals. Otherwise if the user gives a number not within the range then the 
	 * program will throw back error message
	 */
	public static void main (String[]args)
	{
		//Input variables
		String input;
		
		//Storage variables
		int num;
		
		//Get number from user
		input = JOptionPane.showInputDialog("Insert number between 1 and 10");
		//Parse input message
		num = Integer.parseInt(input);
		
		//Switch to determine what number the user submitted
		switch (num)
		{
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
			
		}
	}
}
