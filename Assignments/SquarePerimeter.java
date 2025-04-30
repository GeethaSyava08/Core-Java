package Assignments;

import java.util.Scanner;

public class SquarePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4×Side Length
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sides of square");
		int l=s.nextInt();
		p=4*l;
		System.out.println("The  Perimeter of square is: "+p);	
		s.close();
		
	}

}
