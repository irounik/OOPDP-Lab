package day1;

/*
Write a program to print the element of an array
that has occurred the highest number of times.
*/

import java.util.Scanner;

public class HighestFreq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements(N): ");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int num = arr[0];
		int freq = 1;
		
		for(int i=0; i<n; i++) {
			int tempFreq = 0;
			for(int j=0; j<n;j++) {
				if(arr[j] == arr[i]) {
					tempFreq++;
				}
			}
			if(tempFreq>freq) {
				freq = tempFreq;
				num = arr[i];
			}
		}
		
		System.out.println(num +" occurred the highest number of times");
		
	}

}
