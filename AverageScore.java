
package CopyPracticeCode;
import javax.swing.JOptionPane;
public class AverageScore {

	public static void main (String[]args) {
		
		/*
		 * This Program demonstrates the if statement
		 */
		
		double score1;
		double score2;
		double score3;
		double average;
		String input;
		
			//Get the first test score.
			input = JOptionPane.showInputDialog("Get score #1: ");
			score1 = Double.parseDouble(input);
			
			//Get the second test score.
			input = JOptionPane.showInputDialog("Get score #2: ");
			score2 = Double.parseDouble(input);
			
			//Get the third test score.
			input = JOptionPane.showInputDialog("Get score #3: ");
			score3 = Double.parseDouble(input);
			
			//Calculate average
			average = (score1 + score2 + score3) / 3.0;
			
			//Display average of the three scores.
			JOptionPane.showMessageDialog(null, "The average is " + average);
			
			//If the score was greater than 95, let the user know
			//that's a great score
			if (average > 95.0)
				JOptionPane.showMessageDialog(null , "Wow that's a great score!");
				System.exit(0);
			
	}
}
