import java.util.Scanner;
public class Scanners {

	public static void main (String[]args) {
		//Creating scanner to obtain input
		Scanner kb = new Scanner(System.in);
		
		//Variables will be given the values by the user
		String name;
		int hours;
		double payRate;
		double grossPay;
		
			//Get users Name
			System.out.println("Type Name:");
			name = kb.nextLine();
		
			//Get users hours worked
			System.out.println("Hours worked:");
			hours = kb.nextInt();
		
			//Get users PayRate
			System.out.println("Pay Rate:");
			payRate = kb.nextDouble();
			
			//calculating pay rate
			grossPay = hours * payRate;
		
			//Print out pay roll
			System.out.println(name + " your gross pay is: " + grossPay);
		
		}
	
}
