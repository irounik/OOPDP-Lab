package day3;

/*
 Q1.Write a program to reverse the elements of a given 2*2 array. 
  	Four integer numbers needs to be passed as Command Line arguments

	Ex: 1 2 3 4
	
	O/P Expected :
	
	The given array is : 
	1 2
	3 4
	
	The reverse of the array is : 
	4 3
	2 1
*/

import java.util.Scanner;

public class Reverse_Array {
	
	private static void printArr(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = 2, c = 2;
		
		int A[][] = new int[r][c];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				System.out.println("Enter element at A("+i+","+j+")");
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("The give array is: ");
		printArr(A);
		
		int temp[];
		for(int i=0,j=r-1; i<j; i++,j--) {
			temp = reverse(A[i]);
			A[i] = reverse(A[j]);
			A[j] = temp;
		}
		
		System.out.println("The reversed array is: ");
		printArr(A);
		
	}
	
	static int[] reverse(int arr[]) {
		for(int i=0, j =arr.length-1; i<j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

}