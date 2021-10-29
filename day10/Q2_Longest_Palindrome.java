package day10;

import java.util.Scanner;

public class Q2_Longest_Palindrome {
	
	static String getLongestPal(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		String ans = "";
		
		for(int i=0; i<str.length()-ans.length(); i++) {
			
			String odd = expandAndCheck(str, i, i);
			if(ans.length() < odd.length()) ans=odd;
			
			if(str.charAt(i) == str.charAt(i+1)) {
				String even = expandAndCheck(str, i, i+1);
				if(even.length() > ans.length()) ans = even;
			}
		}
		return ans;
	}
	
	static String expandAndCheck(String str, int i, int j) {
		String ans = i==j ? ""+str.charAt(i) : str.charAt(i)+""+str.charAt(j);
		while(--i>=0 && ++j<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				ans = str.charAt(i) + ans + str.charAt(j);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String ans = getLongestPal(str);
		System.out.println("Longest Palindrome is: ");
		System.out.println(ans);
	}
}