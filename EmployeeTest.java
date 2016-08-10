package helloworldapp;

import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String args[]){
	
		Employee emp1,emp2;
//		emp1 = new Employee();
	//	emp2 = new Employee();
		System.out.println("Enter the first name, last name and the "
				+ "monthly salary of the first employee\n");
		Scanner input = new Scanner(System.in); 
		String fname = input.nextLine();
		String lname = input.nextLine();
		double sal = input.nextDouble();
		emp1 = new Employee(fname, lname, sal);
		input.nextLine();
		/*emp1.setFirstName(fname);
		emp1.setLastName(lname);
		emp1.setSalary(sal);*/
		System.out.println("\nEnter the input for the seond employee in the same order\n");
		fname = input.nextLine();
		lname = input.nextLine();
		sal = input.nextDouble();
		emp2 = new Employee(fname, lname, sal);
/*		emp2.setFirstName(fname);
		emp2.setLastName(lname);
		emp2.setSalary(sal);*/
		input.close();
		System.out.println("Yearly salary of the first employee - " + 12*emp1.getSalary()
						+ "\nYearly salary of the second employee - " + 12*emp2.getSalary());
		System.out.println("\nYearly salary of employees after 10% raise - \n");
		emp1.setSalary((emp1.getSalary())*1.10);
		emp2.setSalary((emp2.getSalary())*1.10);
		System.out.println("Employee 1 - " + emp1.getSalary() + "\nEmployee 2 - " + emp2.getSalary());
	}
}
