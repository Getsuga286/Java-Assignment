package helloworldapp;

public class Date {
	
	int month;
	int day;
	int year;
	public Date(){
		month = 0;
		day = 0;
		year = 0;
	}
	public Date(int mm, int dd, int yy){
		month = mm;
		day = dd;
		year = yy;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate(){
		System.out.println(month + "/" + day + "/" + year);
	}

}
