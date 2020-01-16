import  java.util.Scanner;
public class PersonalInformation {
	
	public static void main(String[]args) {
		 
		//Activate Keyboard
		Scanner kb = new Scanner(System.in);
		
		//Variables for users personal information
		String name;
		String fullAdress;
		String cel;
		String major;
		
		//Get users Information
		System.out.println("Full name");
		name = kb.nextLine();
		System.out.println("Full address: ");
		fullAdress = kb.nextLine();
		System.out.println("Telephone number: ");
		cel = kb.nextLine();
		System.out.println("Major: ");
		major = kb.nextLine();
		
		System.out.println("Personal Information:\n 1." +
							name + "\n" + fullAdress + "\n" + cel + "\n" + major);
		
		
		
		
	}
}
