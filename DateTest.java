package helloworldapp;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input month - ");
		int month = input.nextInt();
		System.out.print("Input day - ");
		int day = input.nextInt();
		System.out.print("Input year - ");
		int year = input.nextInt();
		System.out.print("\nCurrent date - ");
		Date date = new Date(month, day, year);
		date.displayDate();
		input.close();	
	}

}
