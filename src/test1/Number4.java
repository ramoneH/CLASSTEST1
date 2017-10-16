package test1;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		
		String line = System.lineSeparator();
		
		System.out.println("Hey Computer Am I On Vacation ?? " + line + "Enter  Yes or No ");
		
		String isVacationTrue = new Scanner(System.in).nextLine();
		
		System.out.println("Hey Computer Is today A weekday?? " + line + "Enter  Yes or No ");
		
		String isWeekdayTrue = new Scanner(System.in).nextLine();
		
		boolean vacation = vacation(isVacationTrue);
		boolean weekday = weekday(isWeekdayTrue);
		
		//System.out.println(weekday(isWeekdayTrue + isVacationTrue));
		System.out.println("Well Damn My Question Is Can I SLEEP IN !!!!");
		
		sleepin(vacation,weekday);
		
		
	}
	
public static boolean sleepin(boolean va, boolean we ) {
	
	if(va == true && we == false) {
		
		System.out.println("yep you can sleep in");
		return true;
		
	}
else {
	
	System.out.println("Well NO You BETTER get YA BuTT OuttA Bed");
	return false;
}
			
	}
public static boolean vacation(String isVacationTrue) {
	if(isVacationTrue.matches("Yes")) {
		System.out.println("Oh its Vacation Time");
		return true;
	}
		else {
//			System.out.println("Nope Its the Weekend");
			return false;
		}
		
	}
public static boolean weekday(String isWeekdayTrue) {
	if(isWeekdayTrue.matches("Yes")) {
		System.out.println("Oh its a Weekday TOO ");
		return true;
	}
		else {
//			System.out.println("Nope Its the Weekend");
			return false;
		}
	
		
	}

	}
	

