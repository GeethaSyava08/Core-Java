package string;

import java.util.Scanner;

public class AverageValues {

	public static void main(String[] args) {
		
		
		/* int a[]= {1,2,3,19}; int sum=0;
		  
		  for(int i=0;i<a.length;i++) { sum=sum+a[i];
		  
		  } double average = (double) sum /a.length; System.out.println(sum);
		  System.out.println(average);*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of values");
		int size = sc.nextInt();

		int array[] = new int[size];
		System.out.println("enter the values of array");

		int sum = 0;
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}
		double average = (double) sum / size;
		System.out.println(sum);
		System.out.println(average);
	}

}
