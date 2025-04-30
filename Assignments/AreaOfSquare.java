package Assignments;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int area;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the sides of square");
		int s=s1.nextInt();
		area=s*s;
		System.out.println("The area of square is= "+area);	
		s1.close();
		
	}

}
