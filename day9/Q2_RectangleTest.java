package day9;

/*
 *  Create a class Rectangle. This class has attributes 
 *  length and width, each of which defaults to 1. 
 *  It has methods that calculate the perimeter and the area
 *  of the rectangle. It has set and get methods for both 
 *  length and width. The set methods should verify that 
 *  length and width are each floating-point numbers larger 
 *  than 0.0 and less than 20.0. Write a program to test 
 *  class Rectangle.
 */
import java.util.Scanner;

class Rectangle {
	private float length, width;
	
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	Rectangle() {
		this(1,1);
	}
	
	float getLength() {
		return length;
	}
	
	void setLength(float length) {
		if(length<0 || length>20) {
			System.err.println
			("Please enter a valid length");
		}
		else {
			this.length = length;
		}
	}
	
	float getWidth() {
		return width;
	}
	
	void setWidth(float width) {
		if(width<0 || width>20) {
			System.err.println
			("Please enter a valid length");
		}
		else {
			this.width = width;
		}
	}
	
	float getPerimeter() {
		return 2* (length+width);
	}
	
	float getArea() {
		return length*width;
	}
}


public class Q2_RectangleTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter length of rectangle");
		rect.setLength(sc.nextFloat());
		
		System.out.println("Enter width of rectangle");
		rect.setWidth(sc.nextFloat());
		sc.close();
		
		System.out.println("Area is: "+rect.getArea());
		System.out.println("Parimeter is: "+ rect.getPerimeter());

	}

}
