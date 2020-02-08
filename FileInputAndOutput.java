package codePrac;

import javax.swing.JOptionPane;
import java.io.*;
public class FileInputAndOutput {
	public static void main (String[]args) throws FileNotFoundException 
	{
		/*
		 * In this program we will practice the introductory phases of input and 
		 * output of files in java. Establish how to create the file, let the user name the file and submit code.
		 * This example will use the appreciation I have for my partner in life. :3
		 */
		
		//Input variable
		String input = "File";
		
		String boy = "Giovanni Gonzalez Gomez";
		String girl = "Alejandra Cotto Lopez";
		
		//Create file for input and output
		PrintWriter testFile = new PrintWriter (input);
		
		//Write some words for the file
		testFile.print(boy + " loves ");
		testFile.print(girl + "very much!");
		testFile.println(" :3");
		testFile.close();

		
		//Always remember to close file
	}
}
