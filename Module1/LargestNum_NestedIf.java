package Module1;

public class LargestNum_NestedIf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte n1 = 30;
		int n2 = 20;
		double n3 = 99.90, largest;

		if (n1 >= n2) {
			if (n1 >= n3) {
				largest = n1;
			} else {
				largest = n3;
			}
		} else {
			if (n2 >= n3) {
				largest = n2;

			} else {
				largest = n3;
			}
		}
		System.out.println("largest number is" + largest);

	}

}
