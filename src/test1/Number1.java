package test1;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		/* For Every First Word Entered 
		 * Place The Second Word In The Middle 
		 * Of First Word
		 * 1 Take First Word 
		 * 2 Take Second Word
		 * 3 Take Second Word And 
		 *   Place In The Middle Of First Word
		 * 4 Print New Word
		 */
		System.out.println("Enter A Word with 6 Letters");
		String first = new Scanner(System.in).nextLine();
		System.out.println("Now Enter A Word with 3 Letters");
		String second = new Scanner(System.in).nextLine();
		
		if(first.length()==6 && second.length()==3) {
			System.out.println(first.substring(0, 3) + second + first.substring(3));
			
		}
		else {
			System.out.println("You Didn't meet the Conditions TO Create A WORD");
		}
	}

}
