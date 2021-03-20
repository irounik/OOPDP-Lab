package day9;

/*
 *  Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, 
 *  Parallelogram, Rectangle and Square. Use Quadrilateral as the super 
 *  class of the hierarchy. Make the hierarchy as deep (i.e., many levels) 
 *  as possible. Specify the instance variables and methods for each class. 
 *  The private instance variables of Quadrilateral should be the x-y 
 *  coordinate pairs for the four end-points of the Quadrilateral. 
 *  Write a program that instantiates objects of your classes and outputs 
 *  each object’s area (except Quadrilateral).
 */

import java.util.Scanner;

class Point {
	double x, y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	double distance(Point p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}

class Quadrilateral {
	Point A, B, C, D;
	Quadrilateral(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	double getArea() {
		return Math.abs((A.x*B.y + B.x*C.y + C.x*D.y + D.x*A.y)-
				(B.x*A.y + C.x*B.y + D.x+C.y + A.x*D.y))/2; 
	}
}

class Trapezoid extends Quadrilateral {
	double parallelSide1, parallelSide2, height;
	Trapezoid(double parallelSide1, double parallelSide2, double height) {
		super(
				new Point(0,0), 
				new Point(parallelSide1, 0),
				new Point(0, height),
				new Point(parallelSide2, height)
			);
		this.parallelSide1 = parallelSide1;
		this.parallelSide2 = parallelSide2;
		this.height = height;
	}
	@Override
	double getArea() {
		return (parallelSide1 + parallelSide2)*height/2;
	}
}

class Parallelogram extends Trapezoid {
	double base, height;
	Parallelogram(double base, double height) {
		super(base, base, height);
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		return base*height;
	}
}

class Rectangle_ extends Parallelogram {
	double length, width;
	
	Rectangle_(double length, double width) {
		super(length, width);
		this.length = length;
		this.width = width;		
	}
	
	@Override
	double getArea() {
		return length*width;
	}
}

class Square extends Rectangle_ {
	double length;
	Square(double length) {
		super(length, length);
		this.length = length;
	}
	@Override 
	double getArea() {
		return length*length;
	}
}

public class Q4_Quad_MLI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadrilatreal: ");
		System.out.println("Enter 4 points as, x y, in clockwise manner: ");
		
		Point A = new Point(sc.nextDouble(), sc.nextDouble());
		Point B = new Point(sc.nextDouble(), sc.nextDouble());
		Point C = new Point(sc.nextDouble(), sc.nextDouble());
		Point D = new Point(sc.nextDouble(), sc.nextDouble());
		
		Quadrilateral ABCD = new Quadrilateral(A, B, C, D);
		System.out.println("Area of Quadrilateral: "+ABCD.getArea());
		
		System.out.println("\nEnter the Parallel Sides for Trapezoid: ");
		double ps1 = sc.nextDouble();
		double ps2 = sc.nextDouble();
		System.out.println("Enter distance between them: ");
		double height = sc.nextDouble();
		
		Trapezoid trap = new Trapezoid(ps1, ps2, height);
		System.out.println("Area of Trapizium is: " + trap.getArea());
		
		System.out.println("\nEnter base and height for Parallelogram: ");
		double base = sc.nextDouble();
		height = sc.nextDouble();
		
		Parallelogram pl = new Parallelogram(base, height);
		System.out.println("Area of this Paralleogram is: " + pl.getArea());
		
		System.out.println("\nEnter the length and width of rectangle: ");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		
		Rectangle_ rect = new Rectangle_(length, width);
		System.out.println("Area of rectangel is: " + rect.getArea());
		
		System.out.println("\nEnter the length of side: ");
		double side = sc.nextDouble();
		
		Square sq = new Square(side);
		System.out.println("Area of square will be: " + sq.getArea());
		sc.close();
	}
}