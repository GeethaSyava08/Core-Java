package string;

public class ArrayCopy_reverse {
	public static void main(String[] args) {

	int original[] = { 10, 20, 30, 40, 50 };
	int[] rev = new int[original.length];

	System.out.println("original array:");
	for (int i = 0; i < original.length; i++) 
	{
		System.out.print(original[i]+ " ");
		rev[i] = original[original.length-1-i];
	}

	System.out.println("rev Array:");

	for (int i = 0; i < rev.length; i++) {
		System.out.print((rev[i]) + " ");
		
		//we should use toString for print in array format--Arrays.toString()

}}
}
