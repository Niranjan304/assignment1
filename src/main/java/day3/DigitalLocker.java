package day3;

import java.util.Scanner; 

public class DigitalLocker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		System.out.println("Entre Sceurity code: ");
		code = sc.nextInt();

		if (code <= 0) {
			System.out.println("Entre a number greater than 0");
			return; 		}

		String strcode = Integer.toString(code);

		for (int i = 0; i < strcode.length(); i++) {
			int digit = Character.getNumericValue(strcode.charAt(i));
			if (digit % 2 == 0) {
				System.out.println(digit * digit);
			} else {
				System.out.println(digit * digit * digit); 			}
		}

		int sum = 0;
		int flag = 0;
		for (int j = 0; j < strcode.length(); j++) {
			sum = sum + Character.getNumericValue(strcode.charAt(j));
			flag = sum;
		}

		if (flag % 2 == 0) {
			System.out.println(sum % 2);
		} else {
			System.out.println((sum * 3) + 1);
		}
		

		if (flag <= 50) {
			System.out.println("Week");
		} else if ((flag >= 51) && (flag <= 150)) { 
			System.out.println("Moderate");
		} else if ((flag >= 151) && (flag <= 300)) {
			System.out.println("Strong");
		} else {
			System.out.println("Very Strong"); 
		}

		for (int i = 0; i < strcode.length(); i++) {
			if (Character.getNumericValue(strcode.charAt(i)) == 5) {
				System.out.println("Hidden Security Triggre Activated!");
			}
		}
	}
}
