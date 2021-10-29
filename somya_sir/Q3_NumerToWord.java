package somya_sir;

import java.util.Scanner;

public class Q3_NumerToWord {

	static String numberToWord(int num) {
		String ans = "";
		while(num>0) {
			ans = getWord(num%10)+" "+ans;
			num/=10;
		}
		return ans;
	}
	
	static String getWord(int n) {
		switch(n) {
			case 1: return "One"; 
			case 2: return "Two"; 
			case 3: return "Three"; 
			case 4: return "Four"; 
			case 5: return "Five"; 
			case 6: return "Six"; 
			case 7: return "Seven"; 
			case 8: return "Eight"; 
			case 9: return "Nine"; 
			default: return "Zero";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(numberToWord(n));
	}
}