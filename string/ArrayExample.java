package string;

public class ArrayExample {

	public static void main(String[] args) {
		

		int[] numbers = {10,20,30,40};
		System.out.println("length of array: "+numbers.length);

		numbers[2]=99;
		System.out.println("after modified index 2 is: " +numbers[2]);
		
		for(int i=0;i<numbers.length;i++)
			
		{
			System.out.println(numbers[i]);
		}
		
	}

}
