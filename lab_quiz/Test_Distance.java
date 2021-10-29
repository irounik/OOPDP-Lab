package lab_quiz;

import java.util.Scanner;

public class Test_Distance {

	static double getDistance(double x1, double y1, double x2, double y2) {
		double dx = x2-x1, dy = y2-y1;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x co-ordinate for the first point: ");
		double x1 = sc.nextDouble();
		
		System.out.println("Enter y co-ordinate for the first point: ");
		double y1 = sc.nextDouble();
		
		System.out.println("Enter x co-ordinate for the second point: ");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter y co-ordinate for the second point: ");
		double y2 = sc.nextDouble();
		
		sc.close();
		
		double distance = getDistance(x1, y1, x2, y2);
		
		System.out.printf("Distance between (%.2f,%.2f) and (%.2f,%.2f)"
				+ " is %.2f", x1, y1, x2, y2, distance);
		
	}

}