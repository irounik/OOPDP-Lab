package day4;

/*	Q3
 * 
 *  Create a class called Employee that includes three pieces of information
 *  as instance variables:
 *   	first name (type String), 
 *   	last name (type String)
 *  	monthly salary (double). 
 *  
 *  The class should have a constructor that initializes the three instance variables. 
 *  
 *  Provide a set and a get method for each instance variable. 
 *  
 *  If the monthly salary is not positive, set it to 0.0. 
 *  
 *  >> Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
 *  
 *  >> Create two Employee objects and display each object’s yearly salary. 
 *  
 *  >> Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 *
 */

import java.util.Scanner;

public class EmployeeTest {
	
	static class Employee {
		
		private String first_name, last_name;
		private double salary;
		
		Employee(String fst, String lst, double sal) {
			first_name = fst;
			last_name = lst;
			salary = Math.max(0, sal);
		}
		
		void set_first_name(String FirstName) {
			first_name = FirstName;
		}
		
		String get_first_name() {
			return first_name;
		}
		
		void set_last_name(String LastName) {
			last_name = LastName;
		}
		
		String get_last_name() {
			return last_name;
		}
		
		void set_salary(double sal) {
			salary = sal;
		}
		
		double get_salary() {
			return salary;
		}
		
		double get_anual_sal() {
			return 12*salary;
		}
		
		void increment() { // 10 % increment
			set_salary((salary+(salary/10)));
		}
		
		String get_full_name() {
			return first_name+ " " +last_name;
		}
		
	}
	
	static Scanner sc;
	
	static Employee initEmployee() {
		
		System.out.println("First Name: ");
		String fst = sc.next();
		
		System.out.println("Last Name: ");
		String lst = sc.next();
		
		System.out.println("Monthly Salary: ");
		double sal = sc.nextDouble();
		
		return new Employee(fst, lst, sal);
		
	}
	
	public static void main(String[] args) {
		
		sc =  new Scanner(System.in);
		
		// Input
		System.out.println("For the first employee enter: ");
		Employee e1 = initEmployee();
		
		System.out.println("For the second employee enter: ");
		Employee e2 = initEmployee();
		
		sc.close();
		
		// Printing Annual Salary
		System.out.println("Anual Salary for "+ e1.get_full_name() + " is: ");
		System.out.println(e1.get_anual_sal());
		
		System.out.println("Anual Salary for "+ e2.get_full_name() + " is: ");
		System.out.println(e2.get_anual_sal());
		
		// Giving a 10% increment
		e1.increment();
		e2.increment();
		
		System.out.println("After increment: ");
		
		System.out.println("Anual Salary for "+ e1.get_full_name() + " is: ");
		System.out.println(e1.get_anual_sal());
		
		System.out.println("Anual Salary for "+ e2.get_full_name() + " is: ");
		System.out.println(e2.get_anual_sal());
		
	}

}