package day5;

/*
 	Q5.
	Write an application that input marks of a student and using
	switch statements print the Grade of the student as follows:
	
	Marks 90-100: Grade A
	
	80-89: Grade B
	70-79: Grade C
	60-69: Grade D
	50-59: Grade E
	00-49: Grade F
 
*/
import java.util.Scanner;

public class Q4_Grades {

	static String getGrade(int num) {
		
		switch(num/10) {
			case 10: case 9: return "Grade A";
			case 8: return "Grade B";
			case 7: return "Grade C";
			case 6: return "Grade D";
			case 5: return "Grade E";
			default: return "Grade F";
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Student got " + getGrade(num));
		
	}

}

/*
	String grade;
switch(number/10) {
	case 10: case 9:
		grade = "Grade A";
		break;
	case 8: 
		grade = "Grade B";
		break;
	case 7: 
		grade = "Grade C";
		break;
	case 6:
		grade ="Grade D";
		break;
	case 5: 
		grade = "Grade E";
		break;
	default: grade = "Grade F";
}
return grade;	  
*/