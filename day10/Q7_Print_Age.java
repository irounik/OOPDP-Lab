package day10;

import javax.swing.JOptionPane;

/*
 
 Write a program to accept name and age of a person from the command prompt
 (passed as arguments when you execute the class) and ensure that the age 
 entered is >=18 and < 60. Display proper error messages. The program must 
 exit gracefully after displaying the error message in case the arguments 
 passed are not proper. 
 (Hint : Create a user defined exception class for handling errors.)

 */

public class Q7_Print_Age {
	
	static class InvalidAgeException extends Exception {
		InvalidAgeException(String exc) {
			super(exc);
		}
	}
	
	static class Person {
		String name;
		int age;
		Person(String name, int age) throws InvalidAgeException {
			if(age<18 || age>60) {
				throw new InvalidAgeException("Age not in range(18,60) inc.");
			} else {
				this.name = name;
				this.age = age;
			}
		}
		void info() {
			System.out.println("Name: "+name);
			System.out.println("Roll No: "+age);
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		try {
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			Person person = new Person(name, age);
			person.info();	
		} catch (IndexOutOfBoundsException outOfBound) {
			System.err.println("Command Line Arguments not defined!");
		}	
	}
}