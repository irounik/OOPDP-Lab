package day8;

/*

A HighSchool application has two classes: the Person superclass and the Student subclass. 
Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. 
A Teacher will be like Person but will have additional properties such as salary 
(the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). 
The CollegeStudent class will extend the Student class by adding a year (current level in college) 
and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).
 
*/

import java.util.Scanner;

public class Q2_College_Schema {

	static class Person {
		String name;
		int age;
		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		void details() {
			System.out.println("\tName:\t"+name);
			System.out.println("\tAge:\t"+ age);
		}
	}
	
	static class Student extends Person {
		
		String rollNo;
		String course;
		
		Student(String name, int age, String rollNo, String course) {
			super(name,age);
			this.rollNo = rollNo;
			this.course = course;
		}
		
		@Override 
		void details() {
			super.details();
			System.out.println("\tRoll No: "+ rollNo);
			System.out.println("\tCourse:\t"+ course);
		}
	}
	
	static class Teacher extends Person {
		int salary;
		String subjest;
		
		Teacher(String name, int age, int sal, String subject) {
			super(name,age);
			this.salary = sal;
			this.subjest = subject;
		}
		
		@Override
		void details() {
			super.details();
			System.out.println("\tSalary:\t"+salary);
			System.out.println("\tSubject: "+subjest);
		}
	}
	
	static class CollegeStudent extends Student {
		
		int year;
		String major;
		CollegeStudent(String name, int age, String rollNo, String course, int year, String major) {
			super(name, age, rollNo, course);
			this.year = year;
			this.major = major;
		}
		
		@Override
		void details() {
			super.details();
			System.out.println("\tYear:\t"+year);
			System.out.println("\tMajor:\t"+major);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 for Teacher & 2 for Student: ");
			int n = sc.nextInt();
			if(n==1) {
				System.out.println("Enter full name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Enter age:");
				int age = sc.nextInt();
				
				System.out.println("Enter Salary:");
				int sal = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Subject: ");
				String sub = sc.nextLine();
				
				Teacher t = new Teacher(name, age, sal, sub);

				System.out.println("=======================================");
				t.details();
				System.out.println("=======================================");
				
			}
			else if(n==2) {
				System.out.println("Enter full name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Enter age:");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Roll No: ");
				String roll = sc.nextLine();
				
				System.out.println("Enter Course: ");
				String course = sc.nextLine();
				
				System.out.println("Enter Year: ");
				int year = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Major: ");
				String major = sc.nextLine();
				
				CollegeStudent c = new CollegeStudent(name, age, roll, course, year, major);
				
				System.out.println("=======================================");
				c.details();
				System.out.println("=======================================");
			}
			else {
				System.err.println("Error: Invalid Option, please choose 1 or 2");
			}
			System.out.println("Wanna Continue ? (Y/N)");
			String exit = sc.next();
			if(exit.toUpperCase().equals("N")) {
				System.out.println("Exit Complete!");
				break;
			}
		}
		sc.close();
	}
	
}