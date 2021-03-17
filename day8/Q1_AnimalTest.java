package day8;

/*

Create a class named ‘Animal’ which includes methods like eat() and sleep(). 
Create a child class of Animal named ‘Bird’ and override the parent class methods. 
Add a new method named fly(). Create an instance of Animal class and invoke the eat and 
sleep methods using this object.Create an instance of Bird class and invoke the eat, 
sleep and fly methods using this object.

*/

public class Q1_AnimalTest {

	static class Animal {
		void eat() {
			System.out.println("Animal is Eating.");
		}
		void sleep() {
			System.out.println("Animal is Sleeping.");
		}
	}
	
	static class Bird extends Animal {
		@Override 
		void eat() {
			System.out.println("Bird is Eating.");
		}
		
		@Override 
		void sleep() {
			System.out.println("Bird is Sleeping.");
		}
		
		void fly() {
			System.out.println("Bird is Flying.");
		}
	}
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
		
	}
	
}