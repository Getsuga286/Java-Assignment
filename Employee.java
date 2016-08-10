package helloworldapp;

public class Employee {
	public String firstName;
	public String lastName;
	public double salary;
	public Employee(){
		firstName="";
		lastName="";
		salary=0;
	}
	public Employee(String nfirst, String nlast, double sal){
		firstName=nfirst;
		lastName=nlast;
		salary=sal;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=0)
			this.salary = salary;
	}

	public static void main(String[] args) {
		

	}

}
