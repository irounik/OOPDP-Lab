package endsems;

/*
 
 A company wants to transmit data over the telephone but is concerned that its phones 
 may be tapped. It has asked you to write a program that will encrypt the data so that 
 it may be transmitted more securely. 
 
 All the data is transmitted as an array of 10 integers. 
 The application should read an array of ten integers entered by the user and encrypt 
 it as follows: 
 
 Replace each number with the result of multiplying 5 to the number and getting the 
 remainder after dividing the new value by 4.
 Then reverse the entire array and print the encrypted array. 
 
 Write a separate application that inputs an encrypted array of ten integers and decrypts 
 it to form the original array. 
 
 */

class Encryption {
	
	private int[] arr;
	
	Encryption(int[] array) {
		this.arr = array;
		encrypt();
	}
	
	void encrypt() {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			arr[i]= (arr[i]*5)%4;
		}
		
		for(int i=0,j=n-1; i<j; i++,j--) {
			swap(arr,i,j);
		}
		
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void printEncrypted() {
		System.out.println("\nEncrypted Array Will Be:");
		for(int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
}

public class Q1_EncryptionTest {

	public static void main(String[] args) {
	
		int[] array= {0,1,2,3,4,5,6,7,8,9};
	
		System.out.println("Given array to encrypt: ");
		for(int element : array) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		Encryption encryption = new Encryption(array);
		encryption.printEncrypted();		
	}

}