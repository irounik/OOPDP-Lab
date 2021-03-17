package day5;

import java.util.Scanner;

public class Q5_Sotr_And_Search {
	
	static void printArr(int[] a) {
		for(int i:a) System.out.print(i+" ");
		System.out.println();
	}
	
	private static void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n - 1; j++) {
		    	if (a[j] > a[j + 1]) {
		        	a[j] = a[j]^a[j+1];
		        	a[j+1] = a[j]^a[j+1];
		        	a[j] = a[j]^a[j+1];
		        }
		    }
		}
	}
	
	private static int search(int[] arr, int key) {
		
		int s = 0, e = arr.length - 1, mid;
		
		while(s <= e) {
			
			mid = (s+e)/2;
			
			if(arr[mid] == key) return mid;
			else if(arr[mid] < key) s = mid+1;
			else e = mid-1;
			
		}
		
		return -1;
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elemtnts in array.");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		System.out.println("Entered array: ");
		printArr(arr);
		
		System.out.println("Sotred array: ");
		sort(arr);
		printArr(arr);
		
		System.out.println("Enter key: ");
		int key = sc.nextInt();
		sc.close();
		
		int ind = search(arr,key);
		
		if(ind == -1) System.out.println("Key not found");
		else System.out.println("Key found at index : "+ind);
		
	}

}