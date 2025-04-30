package Module1;

import java.util.Scanner;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a= ");
		int a=s1.nextInt();
		System.out.println("Enter the value of b= ");
		int b=s1.nextInt();
		
		int sum=a+b;
		System.out.println("sum of a+b=" + sum);
		s1.close();
	}

}
