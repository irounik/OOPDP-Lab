package day3;

import java.util.Scanner;

/*
 Write a program to find greatest number in a 3*3 array. 
 The program is supposed to receive 9 integer numbers as command line arguments
*/

public class Gratest_In_Matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int ROW = 3, COL = 3;
		
		int A[][] = new int[ROW][COL];
		int max = 0;
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.println("Enter the elemetnt at A["+i+"]["+j+"]");
				A[i][j] = sc.nextInt();
				max = i==j && j==0 ? A[i][j] : A[i][j]>max ? A[i][j]:max ;
			}
		}
		sc.close();
		
		System.out.println("Gratest value is: "+max);

	}

}
