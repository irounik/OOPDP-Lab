package day10;

import java.util.Scanner;

public class Q3_Befor_After {
	
	static String getBeforAfter(String str, String word) {
		String ans = "";
		for(int i=0; i<str.length()-word.length(); i++) {
			if(str.charAt(i) == word.charAt(0)) {
				boolean match = true;
				for(int j = 0; j<word.length(); j++) {
					if(str.charAt(i+j) != word.charAt(j)) {
						match = false;
						break;
					}
				}
				if(match) {
					if(i-1>0) {
						ans+=str.charAt(i-1);
					}
					if(i+word.length() < str.length()) {
						ans+=str.charAt(i+word.length());
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the word: ");
		String word = sc.next();
		
		sc.close();
		
		// Output
		String ans = getBeforAfter(str, word);
		
		if(ans.length() == 0) {
			System.out.println("No Occurences");
		}
		else {
			System.out.println("Ans is: "+ans);
		}
	}
}