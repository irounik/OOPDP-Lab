package somya_sir;

import java.util.Scanner;

public class Q4_Dec_To_Bin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the descimal number: ");
		int num = sc.nextInt();
		sc.close();
		
		String bin = num==0 ? "0" : "";
		while(num>0) {
			bin=num%2+bin;
			num/=2;
		}
		
		System.out.println("It's binary form is: "+bin);
	}

}