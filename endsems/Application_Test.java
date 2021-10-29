package endsems;

/*
  
 Create a class called Customer that includes three pieces of 
 information as instance variables-a first name (type String), 
 a last name (type String) and a monthly_grocery_bill (double). 
 The class should have a constructor that initializes the three 
 instance variables. 
 
 Provide a set and a get method for each instance variable. 
 If the monthly grocery bill is less than 100 print a proper 
 error message “check the bill”. 
 
 Write a test application named Application_Test that demonstrates 
 class Customer’s capabilities. Create three Customer objects 
 and display each object’s Yearly Grocery bill. 
 
 Then add 6% inflation in yearly grocery bill and print yearly 
 grocery bill for them again 
 
 */

class Customer {
	
	private final double INFLATION = 6;
	
	private String firstName, lastName;
	private double monthlyGroceryBill;
	
	Customer(String firstName, String lastName, double monthlyGroceryBill) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlyGroceryBill = monthlyGroceryBill;
		checkBill();
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	void setLatName(String lastName) {
		this.lastName = lastName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	void setMonthlyGroceryBill(double monthlyGroceryBill) {
		this.monthlyGroceryBill = monthlyGroceryBill;
		checkBill();
	}
	
	double getMonthlyGroceryBill() {
		return monthlyGroceryBill;
	}
	
	boolean checkBill() {
		if(this.monthlyGroceryBill<100) {
			System.err.println("check the bill");
			return false;
		}
		return true;
	}
	
	double getYearlyBill() {
		return 12*monthlyGroceryBill;
	}
	
	double getInflatedBill() {
		double yearlyBill = getYearlyBill();
		yearlyBill+=(INFLATION/100)*yearlyBill;
		return yearlyBill;
	}
	
	void details() {
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Monthly Bill: "+ monthlyGroceryBill);
	 	System.out.println("Yearly Bill: "+getYearlyBill());
		System.out.println("Inflated Bill: "+getInflatedBill());
		System.out.println();
	}
	
}

public class Application_Test {

	public static void main(String[] args) {

		Customer first = new Customer("Alpha", "Beta", 1000);
		first.details();
		
		Customer second = new Customer("Gama", "Delta", 99);
		second.details();
		
		Customer third = new Customer("Omega", "Pi" , 500);
		third.details();

	}

} 