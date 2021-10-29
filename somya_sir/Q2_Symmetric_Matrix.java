package somya_sir;

// Write a java program to check the matrix is symmetric or not.

import java.util.Scanner;

public class Q2_Symmetric_Matrix {

	static boolean isSymetrical(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if(mat[i][j] != mat[j][i]) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of matrix: ");
		
		int order = sc.nextInt();
		int[][] mat = new int[order][order];
		
		for(int i=0; i<order; i++) {
			for(int j=0; j<order; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println(isSymetrical(mat) ? "It's Symmetrical" : "It's not Symetrical");
	}
}