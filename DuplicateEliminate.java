package helloworldapp;

import java.util.Scanner;

public class DuplicateEliminate {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner input = new Scanner(System.in);
		int currentIndex = -1;
		for(int i=0; i<5; i++){
			boolean counter = true;
			System.out.print("Enter the " + (i+1)+ " number - ");
			int temp = input.nextInt();
			for(int x=0; x<=currentIndex; x++)
				if(array[x] == temp){
					counter = false;
					break;
				}
			if(counter){
				currentIndex++;
				array[currentIndex] = temp;
			}
			System.out.println("Current Array values :");
			for(int x=0; x<=currentIndex; x++)
				System.out.print(array[x] + "\t");
			System.out.println("\n");
		}
		input.close();
	}

}
