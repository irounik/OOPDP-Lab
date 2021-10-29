package day10;

/*
 Write a program in java which implement interface Student which has two 
 methods Display_Grade and Attendance for PG_Students and UG_Students 
 (PG_Students and UG_Students are two different classes for Post Graduate
 and Under Graduate Students respectively).
*/

interface Student {
	void Display_Grade();
	void Attendence();
}

class UG_Students implements Student {
	@Override
	public void Display_Grade() {
		System.out.println("UG Grades");
	}
	
	@Override
	public void Attendence() {
		System.out.println("UG Attendence");
	}
}

class PG_Students implements Student {
	@Override 
	public void Display_Grade() {
		System.out.println("PG Grades");
	}
	
	@Override
	public void Attendence() {
		System.out.println("PG Attendence");
	}
}

public class Q5_UgPg {
	public static void main(String[] args) {
		UG_Students ugStud = new UG_Students();
		System.out.println("For UG Students:");
		ugStud.Display_Grade();
		ugStud.Attendence();
		System.out.println();
	
		PG_Students pgStud = new PG_Students();
		System.out.println("For PG Students:");
		pgStud.Display_Grade();
		pgStud.Attendence();
	}
}