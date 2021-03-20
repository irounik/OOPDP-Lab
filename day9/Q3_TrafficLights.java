package day9;

/*
 *  Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) 
 *  take one parameter-the duration of the light. Write a program to test
 *  the TrafficLight enum so that it displays the enum constants and 
 *  their durations.
 */

public class Q3_TrafficLights {

	static enum TrafficLights {
		RED,
		YELLOW,
		GREEN;
		int getDuration() {
			switch(this) {
				case RED: return 10;
				case YELLOW: return 5;
				case GREEN: return 0;
				default: return -1;
			}
		}
		void disp() {
			System.out.println("Signal: "+this
					+ ", Duration: "+this.getDuration());
		}
	}
	
	public static void main(String[] args) {
		TrafficLights red = TrafficLights.RED;
		TrafficLights green = TrafficLights.GREEN;
		TrafficLights yellow = TrafficLights.YELLOW;

		red.disp();
		green.disp();
		yellow.disp();
	}
	
}