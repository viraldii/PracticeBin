package codePrac;
public class Squares 
{
	public static void main (String[]args)
	{
		int number;	//Loop control variable	
		System.out.println("Number \t \t Number Squared"
				+ "\n-------------------------------");
		//For loops are ideal for known amount of iterations of a process.
		for(number = 1; number <= 20; number++)
		{
			System.out.println(number + "\t \t" + 
						+ (number * number));
		}
		
	}
}
