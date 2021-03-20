package day9;

import java.util.Scanner;

public class Q1_FiboTest {

	static class Fibonacci {
		
		private double a = 0, b = 1, c;
		
		double fibonacci(double n) {
			a = 0;
			b = 1;
			if(n==1) return a;
			else if(n==2) return b;
			for(int i=2; i<n; i++) {
				c = a+b;
				a = b;
				b = c;
			}	
			return c;
		}
		
		int getMaxIntFibo() { 
			int curr=0, i=1;
			double x;
			while(curr < Integer.MAX_VALUE) {
				x = fibonacci(i++);
				if(x>Integer.MAX_VALUE) break;
				else curr = (int) x;
			}
			return curr;
		}
		
		double getMaxDoubleFibo() {
			int i = 1;
			double curr=0,x;
			while(curr <= Double.MAX_VALUE) {
				x = fibonacci(i++);
				if(x>Double.MAX_VALUE) break;
				else curr = x;
			}
			return curr;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'N':");
		
		int n = sc.nextInt();
		Fibonacci f = new Fibonacci();
		
		System.out.println(n+"'th Fibonacci number is: ");
		System.out.println(f.fibonacci(n));

		System.out.println("Maximum Fibonacci in range of \"int\"");
		System.out.println(f.getMaxIntFibo());

		System.out.println("Maximum Fibonacci in range of \"double\"");
		System.out.println(f.getMaxDoubleFibo());
		
		sc.close();
	}

}