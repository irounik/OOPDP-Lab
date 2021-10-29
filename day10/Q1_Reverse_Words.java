package day10;

import java.util.Scanner;

public class Q1_Reverse_Words {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String ans = "";
		for(var s : str.split(" ")) {
			ans = s+" "+ans;
		}
		System.out.println("Reverse: ");
		System.out.println(ans);
	}
}