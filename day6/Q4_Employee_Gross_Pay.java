package day6;

import java.util.Scanner;

class Employee {
	
	private String name;
	private int rate, hours;
	
	Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	double getGross() {
		if(hours<=40) return rate*hours;
		else return 40*rate + (hours-40)*1.5*rate;
	}
	
	String getName() {
		return name;
	}
	
}

public class Q4_Employee_Gross_Pay {
	
	static Scanner sc;
	
	static Employee initEmployee() {
		System.out.println("Enter employee's Name:"); 
		String id = sc.next();
		
		System.out.println("Enter employee's hourly rate:");
		int rate = sc.nextInt();
		
		System.out.println("Enter hours worked last week: ");
		int hours = sc.nextInt();
		
		return new Employee(id, rate, hours);
	}
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		Employee[] list = new Employee[n];

		for(int i=0; i<n; i++) {
			list[i] = initEmployee();
			System.out.println("Gross Pay for " + 
			list[i].getName() + " is "+ list[i].getGross() + " rupees");	
			System.out.println();
		}

	}

}