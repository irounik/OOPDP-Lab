package day10;

/* Write a program in Java to display name and roll number of students. 
 * Initialize respective array variables for 10 students.
 * Handle ArrayIndexOutOfBoundsException, so that any such problem does 
 * not cause illegal termination of program.*/

public class Q6_Student_Test_EH {

	static class Student {
		String name;
		String rollNo;
		Student(String name, String rollNo) {
			this.name = name;
			this.rollNo = rollNo;
		}
		void info() {
			System.out.println("Name: "+ name);
			System.out.println("Roll No: "+ rollNo);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		final int numberOfStudents = 10;
		Student[] students = new Student[numberOfStudents];
		int it = 0;
		try {
			for(int i=0; i<=numberOfStudents; i++) {
				students[it++] = new Student("Student"+(i+1), String.valueOf(i+1));
			}
		} catch(ArrayIndexOutOfBoundsException indExc) {
			System.err.println("Index Out Of Bound!");
		}
		for(Student std: students) {
			std.info();
		}
	}
}