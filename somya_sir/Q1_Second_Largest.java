package somya_sir;

import java.util.Scanner;

public class Q1_Second_Largest {
	
	static int getSecondMax(int[] arr, int n) {
		int m1 = arr[0], m2 = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>m1) {
				m2 = m1;
				m1 = arr[i];
			}
		}
		return m2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondMax(arr,n));
		sc.close();
	}
}