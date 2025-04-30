package string;

public class ArrayCopy {

	public static void main(String[] args) {

		int original[] = { 10, 20, 30, 40, 50 };
		int[] rev = new int[original.length];

		System.out.println("Original Array");
		for (int i = 0; i < original.length; i++) 
		{
			System.out.print(original[i]+ " ");
			rev[i] =original[i];
		}

		System.out.println("copy Array:");

		for (int i = 0; i < rev.length; i++) {
			System.out.print((rev[i]) + " ");
		}
	}}

