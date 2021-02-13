package day4;

import java.util.Scanner;

/* Q4
 * Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 * (dimensions are width, height, depth of double type). 
 * The class should have a method that calculates and returns the volume of the box . 
 * Obtain an object and print the corresponding volume in main() function.
 */

public class Test_Box {
	
	static class Box {
		
		private double length ,width, height;
		
		Box(double l, double w, double h) {
			length = l;
			width = w;
			height = h;
		}
		
		double get_volume() {
			return width*height*length;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For the box enter: ");
		System.out.println("Length: ");
		double l = sc.nextDouble();
		
		System.out.println("Width: ");
		double w = sc.nextDouble();
		
		System.out.println("Height: ");
		double h = sc.nextDouble();
		sc.close();
		
		Box box = new Box(l,w,h);
		
		System.out.println("Volume is: "+ box.get_volume() + " unit cubes");


	}

}
