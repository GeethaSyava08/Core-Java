package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String output = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String s1 = sc.nextLine();

		for (int i = s1.length() - 1; i >= 0; i--) {
			char c1 = s1.charAt(i);
			output = output + c1;
		}

		System.out.println("Reversed string = " + output);

		if (s1.equals(output)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}

		sc.close();
	}
}