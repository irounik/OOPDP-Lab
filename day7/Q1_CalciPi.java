package day7;

public class Q1_CalciPi {

	public static void main(String[] args) {
		
		System.out.println("Iterations\tValue");
		
		double pi = 3.14159,  tol = 0.00001, sum = 0;
		int it = 1;
		
		while(Math.abs(sum-pi) > tol) {
			if(it%2==1) {
				sum+= 4.0/(2*it-1);
			} 
			else {
				sum-= 4.0/(2*it-1);
			}
			sum = (double)Math.round(sum*100000d)/100000d;
			
			System.out.println(it+"\t\t"+sum);
			it++;
		}
		
		System.out.println("After "+it+ " iterations the series converges at PI");

	}

}