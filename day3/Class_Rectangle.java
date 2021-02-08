package day3;

/*
 
 Write a program in Java with class Rectangle with the data fields:
 width, length, area and color. 
 
 The length, width and area are of double type and color is of string type. 
 
 The methods are: set_length() , set_width() , set_color(), and find_area().
 
 Create two object ofRectangle and compare their area and color. 
 If area and color same for the objects then:
 	display “Matching Rectangles”
 	
 otherwise:
 	display “Non Matching Rectangle”.
  
 */

import java.util.Scanner;

public class Class_Rectangle {
	
	static class Rectangle {
		
		double length, width, area;
		String color;
		
		void set_length(double length) {
			this.length = length;
		}
		
		void set_width(double width) {
			this.width = width;
		}
		
		void set_color(String color) {
			this.color = color;
		}
		
		double find_area() {
			return (this.length * this.width);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle A = new Rectangle();
		
		System.out.println("For the first Rectangle: ");
		System.out.println("Enter the length: ");
		A.set_length(sc.nextDouble());
		
		System.out.println("Enter the width: ");
		A.set_width(sc.nextDouble());
		
		System.out.println("Enter the colour: ");
		A.set_color(sc.next());
		
		System.out.println();

		Rectangle B = new Rectangle();
		
		System.out.println("For the second Rectangle: ");
		System.out.println("Enter the length: ");
		B.set_length(sc.nextDouble());
		
		System.out.println("Enter the width: ");
		B.set_width(sc.nextDouble());
		
		System.out.println("Enter the colour: ");
		B.set_color(sc.next());
		
		sc.close();
		
		if(A.find_area() == B.find_area() && A.color.equals(B.color)) {
			System.out.println("Area: "+A.find_area() + " Color: " + B.color);
			System.out.println("Rectangles Matched !");	
		} 
		else {
			System.out.println("Rectangles Not Matched !");
		}
		
	}

}