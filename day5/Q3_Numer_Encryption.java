package day5;

/* Q3.
 * A company wants to transmit data over the telephone but is connected
 * that its phones may be tapped. It has asked you to write a program 
 * that will encrypt the data so that it may be transmitted more securely. 
 * All the data is transmitted as four-digit integers. 
 * The application should read a four-digit integer entered by the user
 * and encrypt it as follows: 

	  Replace each digit with the result of adding 7 to the digit and getting 
	  the remainder after dividing the new value by 10. 
	  Then swap the first digit with the third, 
	  and swap the second digit with the fourth. 
	  Then print the encrypted integer. 
	   
 * Write a separate application that inputs an encrypted four-digit integer 
 * and decrypt it to form the original number
 */

import java.util.Scanner;

public class Q3_Numer_Encryption {

	static class EncryptNum {
		
		private String originalNumber;
		private String encrypted;
		private int[] numArr;
		
		EncryptNum(String num) {
			if(validateInput(num)) {	
				originalNumber = num;
				encrypt();
			} else {
				System.exit(101);
			}
		}
		
		private boolean validateInput(String num) {
			if(num.length()<4) {
				System.err.println("Number is too short!");
				return false;
			}
			for(int i=0; i<num.length(); i++) {
				if(num.charAt(i)<'0' || num.charAt(i)>'9') {
					System.err.println("Invalid Number !");
					return false;
				}
			}
			return true;
		}

		String getEncrypted() {
			return encrypted;
		}
		
		private void encrypt() {
			numArr = new int[originalNumber.length()];
			for(int i=0; i<originalNumber.length(); i++) {
				numArr[i] = ((originalNumber.charAt(i)-'0')+7)%10;
			}
			swap(0,2);
			swap(1,3);
			encrypted = getEncryptedNumber();
		}
		
		private void swap(int i, int j) {
			int temp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = temp;
		}
		
		private String getEncryptedNumber() {
			String ans = "";
			for(int i=0; i<numArr.length; i++) {
				ans+= numArr[i];
			}
			return ans;
		}
		
	}
	
	static class DecryptNum {
		private String decrypted;
		private int[] num;
		
		DecryptNum(EncryptNum encrypted) {
			decrypted = getDecrypted(encrypted.getEncrypted());
		}
		
		private String getDecrypted(String enc_num) {
			num = new int[enc_num.length()];
			
			for(int i=0; i<num.length; i++) {
				num[i] = enc_num.charAt(i)-'0';
			}
			
			String ans = "";
			swap(0,2);
			swap(1,3);
			
			for(int i=0; i<num.length; i++) {
				num[i] = (num[i]+3)%10;
				ans+=num[i];
			}
			return ans;
		}
		
		private void swap(int i, int j) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		
		String getDecrypted() {
			return decrypted;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		EncryptNum e = new EncryptNum(sc.next());
		sc.close();
		System.out.println("Encrypted Number: "+e.getEncrypted());
		
		DecryptNum d = new DecryptNum(e);
		
		System.out.println("Decrypted Number: "+d.getDecrypted());

	}

}