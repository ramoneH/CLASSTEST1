package test1;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		
		System.out.println("Enter A Number to Create A Array Of That Size");
		int num = new Scanner(System.in).nextInt();
		int[] numbers = new int[num + 1];
		
		for (int i =0 ; i < numbers.length ; i++ ) {
					
					numbers[i]=i;	
					System.out.println(numbers[i]);

		}

		
		
			}

			

}
