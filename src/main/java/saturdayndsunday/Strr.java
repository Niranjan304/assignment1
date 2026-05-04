package saturdayndsunday;

import java.util.Scanner;

public class Strr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre");
		String str = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(str);
		sb1.reverse();
		System.out.println(sb1);
		if(str.equals(sb1.toString())) {
			System.out.println("Give String is Palindrom");
		}
		else {
			System.out.println("String was not a palindrome");
		}
	}
}
