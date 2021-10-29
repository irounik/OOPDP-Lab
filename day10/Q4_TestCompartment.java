package day10;

/*
	Create an abstract class Compartment to represent a rail coach. 
	Provide an abstract function notice in this class. 
	
	Derive FirstClass, Ladies, General, Luggage classes from the 
	compartment class. 
	
	Override the notice function in each of them 
	to print notice suitable to the type of the compartment. 
	
	Create a class TestCompartment. Write main function to do the following: 
	
	Declare an array of Compartment of size 10. 
	Create a compartment of a type as decided by a randomly generated integer in the range 
	1 to 4. 
	
	Check the polymorphic behavior of the notice method.

 */

abstract class Compartment {
	abstract void notice();
}

class FirstClass extends Compartment {
	@Override
	void notice() {
		System.out.println("First Class Compartment.");
	}
}

class Ladies extends Compartment {
	@Override
	void notice() {
		System.out.println("Ladies Compartment.");
	}
}

class General extends Compartment {
	@Override
	void notice() {
		System.out.println("General Compartment.");
	}
}

class Luggage extends Compartment {
	@Override
	void notice() {
		System.out.println("Luggage Compartment.");
	}
}

public class Q4_TestCompartment {

	static Compartment getRandomCompartment() {
		int num = (int)(Math.random()*4);
		switch(num) {
			case 0: return new FirstClass();
			case 1: return new Ladies();
			case 2: return new General();
			default: return new Luggage();
		}
	} 
	
	public static void main(String[] args) {
		final int num = 10;
		Compartment[] compartments = new Compartment[num];
			
		for(int i=0; i<num; i++) {
			compartments[i] = getRandomCompartment();
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(i+1 +". ");
			compartments[i].notice();
		}
	}
}