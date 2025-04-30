package string;

import java.util.Arrays;
import java.util.Scanner;

public class ArraytoString {

	public static void main(String[] args) {

		int[] numbers = { 40, 10, 20, 50, 30 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of names");
		int size = sc.nextInt();
		String[] names = new String[size];
		for (int i = 0; i < size; i++)
		{
			System.out.println("enter the name= ");
			names[i] = sc.next();
		}
		System.out.println(Arrays.toString(names));
		sc.close();

		Arrays.sort(numbers);
		System.out.println("sorting the numbers: ");
		System.out.println(Arrays.toString(numbers));
		System.out.println("sorting the names: ");
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

	}

}
