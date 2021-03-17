package day7;

/*
 
 Write a method quality_Points that inputs a student’s average and 
 returns:
  
 4 if the student’s average is 90-100, 
 3 if the average is 80-89,
 2 if the average is 70-79, 
 1 if the average is 60-69 and 
 0 if the average is lower than 60. 
 
 Incorporate the method into an application 
 that reads a value from the user and displays the result.
 
*/
import java.util.Scanner;

public class Q3_Points {

	static int quality_Points(double average) {
		if(average >89) return 4;
		else if(average > 79) return 3;
		else if(average > 69) return 2;
		else if(average > 59) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		while(true) {
			System.out.println("Enter the average marks: ");
			num = sc.nextDouble();
			if(num<100 && num>=0) {
				break;
			}
			else System.err.println("Please enter a valid average!!");
		}
		
		sc.close();
		System.out.println("Quality Points will be: ");
		System.out.println(quality_Points(num));
	}

}