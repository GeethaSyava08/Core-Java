package string;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {

		int array1[]=new int[4];
		int array2[]=new int[4];
		
	//	int[] array1 = {12, 34, 21, 32};
	//	int[] array2 = {12, 34, 21, 32};
		
		array1[0]=12;
		array1[1]=34;
		array1[2]=21;
		array1[3]=32;
		
		array2[0]=12;
		array2[1]=34;
		array2[2]=21;
		array2[3]=3;
		
		boolean b1=Arrays.equals(array1,array2);
		System.out.println(b1);
		
		if(b1==true)
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
