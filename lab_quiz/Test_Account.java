package lab_quiz;

import java.util.Scanner;

/*

Create a class Account with two overloaded constructors. First constructor is used for initializing, 
Account number and initial amount (Rs 5000) in account. Second constructor is used for initializing 
name of account holder, Account number, address, type of account and current balance after deposit 
and withdraws operations. Account class is having methods Deposit(), WithDraw(), and GetBalance(). 
Make necessary assumption for data members and return types of the methods. Define an application 
class called Test_Account and create 3 objects of Account class and display name of account holder, 
Account number, account holder address, type of account and current balance of three objects.

*/

class Account {
	private String name, accNo, address;
	private AccType type;
	private double currBalance;
	
	Account(String accNo) {
		this.accNo = accNo;
		this.currBalance = 5000;
	}
	Account(String name, String accNo, String address, AccType type, double currBalance) {
		this.name = name;
		this.accNo = accNo;
		this.address = address;
		this.type = type;
		this.currBalance = currBalance;
	}
	void Deposit(double amount) {
		this.currBalance+=amount;
		System.out.println("Deposited Rs. "+amount);
	}
	void WithDraw(double amount) {
		System.out.println("Withdrawn Rs. "+amount);
	}
	double getBalance() {
		return currBalance;
	}
	void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Accont No: "+ accNo);
		System.out.println("Address: "+ address);
		System.out.println("Account Type: "+ type);
		System.out.println("Current Balance: "+ currBalance);
	}
}

enum AccType {
	CURRENT, SAVING;
}

public class Test_Account {
	
	static Scanner sc = new Scanner(System.in);
	
	static Account initAcc() {
		
		System.out.println("Name: ");
		String name = sc.nextLine().toUpperCase();
		
		System.out.println("Accout No: ");
		String accNo = sc.nextLine().toUpperCase();
		
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		
		System.out.println("Account type: 1 for Current, 2 for Saving");
		int t = sc.nextInt();
		AccType type = t == 1 ? AccType.CURRENT : AccType.SAVING;
		sc.nextLine();
		
		System.out.println("Enter current balance after deposit: ");
		double bal = sc.nextDouble();
		
		return new Account(name, accNo, address, type, bal);
	}
	
	public static void main(String[] args) {
		
		System.out.println("For first account enter: ");
		Account first = initAcc();
		
		System.out.println("DETAILS: ");
		first.disp();
		System.out.println();
		
		sc.nextLine();
		System.out.println("For second account enter: ");
		Account second = initAcc();
		
		System.out.println("DETAILS: ");
		second.disp();
		System.out.println();
		
		sc.nextLine();
		System.out.println("For third account enter: ");
		Account third = initAcc();
		
		System.out.println("DETAILS: ");
		third.disp();
	}

}
