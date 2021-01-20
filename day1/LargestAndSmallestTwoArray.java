package day1;

/*
Write a program to find the largest 2 numbers
and the smallest 2 numbers in the array
initialized by the user.
*/

import java.util.Scanner;

public class LargestAndSmallestTwoArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = -1;
		boolean valid = false;
		
		while(!valid) {
			System.out.println("Enter the number of elements (N): ");
			n = sc.nextInt();
			
			if(n < 0) {
				System.out.println("Error: N can't be negetive !");
			}
			else if(n<4) {
				System.out.println("Error: Atleast N should be g !");
			} else {
				valid = true;
			}
		}
		
		System.out.println("Enter "+n+" Elements: ");
		int arr[] = new int[n];
		
		arr[0] = sc.nextInt();

		int maxInd = 0, minInd =0, secMaxInd = 1, secMinInd =1;
		
		for(int i=1; i<n; i++) {
			arr[i] = sc.nextInt();	
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]>arr[maxInd]) maxInd = i;
			if(arr[i]<arr[minInd]) minInd = i;
		}

		for(int i=0; i<n; i++) {
			if(i == maxInd || i == minInd) {
				continue;
			} 

			if(arr[i]>arr[secMaxInd]) secMaxInd = i;
			if(arr[i]<arr[secMinInd]) secMinInd = i;
			
		}

		sc.close();
		System.out.println("Max: " + arr[maxInd]);
		System.out.println("Second Max: " + arr[secMaxInd]);
		System.out.println("Min: " + arr[minInd]);
		System.out.println("Second Min: " + arr[secMinInd]);
	}
	
}