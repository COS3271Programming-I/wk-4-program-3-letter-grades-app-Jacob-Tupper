package letter_grade_APP;

import java.util.Scanner;
import java.io.PrintStream;

public class LT_Gr_APP {
	static Scanner usin = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Creating so variable
		PrintStream so = System.out;
		
		//requesting user input
		so.println("Enter a test score:");
        int testscore = usin.nextInt();
        
        //note that in ASCII ... A is 65, B is 66, C is 67, etc. 
        //this converts from grade to ASCII value ... the higher the grade the lower the ASCII value
        int ascii = 74 - (testscore / 10);
        
        //Adjusted the if statement so it can assign a sign to the letter grade, and capturing A from 93-100
        if (ascii > 68) {ascii = 70;
        				so.print("Grade = ");}
        else if(ascii == 65 && testscore%10>3) {ascii = 65;
        										so.print("Grade = ");}
        else if(testscore%10>6) {so.print("Grade = +");}
        else if(testscore%10<3) {so.print("Grade = -");}
        else {so.print("Grade = ");}
        
        //Printing the letter grade
        so.println((char)ascii);
    }
}
