package day6;

/*
Q5
	Develop a Java application that will determine whether any of several department–store
	customers has exceeded the credit limit on a charge account. 
	
	For each customer, the following facts are available:

	i. Account number
	ii. Balance at the beginning of the month  
	iii. Total of all items charged by the customer this month
	iv. Total of all credits applied to the customer’s account this month
	v. Allowed credit limit.
	
	The program should input all these facts as integers, 
	calculate the new balance = (beginning balance + charges - credits), 
	
	display the new balance and determine whether the new balance exceeds 
	the customer’s credit limit. For those customers whose credit limit is exceeded, 
	the program should display the message “credit limit exceeded”.

*/

import java.util.Scanner;

public class Q5_Credit_Limit {	
	
	static class Customer {
		
		private String accNo;
		private int balance, charges, credits, limit;
		private int newBalance;
		
		Customer(String accNo, int bal, int charges, int credit, int limit) {
			this.accNo = accNo;
			this.balance = bal;
			this.charges = charges;
			this.credits = credit;
			this.limit = limit;
			
			getNewBalance();
		}
		
		int getNewBalance() {
			newBalance = balance + charges - credits;
			return newBalance;
		}
		
		boolean isLimitCrossed() {
			return newBalance > limit;
		}
		
		void disp() {
			System.out.println("A/C No: \t" + accNo);
			System.out.println("Old Balance:\t" + balance);
			System.out.println("Credits:\t" + credits);
			System.out.println("Chrages:\t" + charges);
			System.out.println("New Balance:\t"+ newBalance);
			System.out.println("In Limit:\t" + 
			(isLimitCrossed()  ? "No": "Yes" ));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String accNo = sc.next();
		
		System.out.println("Enter old balance: ");
		int bal = sc.nextInt();
		
		System.out.println("Enter total charges: ");
		int charges = sc.nextInt();
		
		System.out.println("Enter total credits: ");
		int credit = sc.nextInt();
		
		System.out.println("Enter the Credit Limit: ");
		int limit = sc.nextInt();
		
		sc.close();
		
		Customer myCustomer = new Customer(accNo, bal, charges, credit, limit);
		
		myCustomer.disp();
		
	}

}