package test1;

import java.util.Scanner;

public class Number3 {
 public static void main(String[] args) {
		// 
		/*	FOR EVERY WORD ENTERED CHECK FOR "LY" IN
		 * 	THE END . 
		 * 1. TAKE THE WORD
		 * 2. CHECK THE LAST TWO CHAR'S.
		 * 3. IF .EQUALS TO "LY" TRUE
		 * 4. ELSE FALSE.
		 */
		//
	 	String noLY = "ly";
		String line = System.lineSeparator();
		System.out.println("ENTER A WORD" + line + "DOESN'T MATTER" + line + "WHAT IT IS ");
		String noly = new Scanner(System.in).nextLine();
		
		
		if(noly.endsWith(noLY) ) {
			System.out.println("ends with" + line + "LY" + line + "Must Be True");
			
		}
		
		else {
			System.out.println("This Word Doesnt End With LY" +line+"Your Best Option Is To RERUN"+line+"The Program And Try Again");
		}
		}
		
	}

