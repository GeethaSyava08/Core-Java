package string;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqualSc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of arrays");
		int size = sc.nextInt();
		System.out.println("the size you entered:"    +size);

		int array1[] = new int[size];
		int array2[] = new int[size];

		System.out.println("enter the values of array1");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("enter the values of array2");
		for (int i = 0; i < size; i++) {
			array2[i] = sc.nextInt();
		}

		boolean b = Arrays.equals(array1, array2);

		if (b) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}

	}

}
