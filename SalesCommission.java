package helloworldapp;

import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of employees - ");
		int number = input.nextInt();
		int[] counters = new int[9];
		for(int temp=0; temp < number; temp++){
			
			System.out.println("Enter the weekly gross sales of " + (temp+1) + " employee");
			double wsal = 200 + (0.09 * input.nextDouble());
			int index = 0;
			for(int x = 200; x<1000; index++, x+=100)
				if(wsal>=x && wsal<=(x+99))
					break;
			counters[index]++;
		}
		input.close();
		System.out.println("\nTabulated Output - \n\nRange\t\tCount");
		for(int x=200, i=0;x<=1000;x+=100, i++){
			
			System.out.println(x + " - " + (x+99) + "\t" + counters[i]);
		}
	}

}
