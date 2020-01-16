import javax.swing.JOptionPane;
public class JavaBox {

	public static void main (String[]args) {
		
		//Variables are filled by user with messege box
		String name1;
		String name2;
		String name3;
		
		//Get first name
		name1 = 
				JOptionPane.showInputDialog("What is "
										+ "your name: ");

		
		name2 = JOptionPane.showInputDialog("What is "
										+ "your name: ");
		
		name3 = JOptionPane.showInputDialog("What is "
										+ "your name: ");
		
		JOptionPane.showMessageDialog(null, "The team is made out of: " + name1 + ", " + name2 + ", "+ name3 + ".");
		
		
	}
}
