package Assignments;

import java.util.Scanner;

public class StaticMethod_2
{

	public static void add() {

		int a = 159;
		int b = 61;
		int c = a + b;

		System.out.println("sum of a+b=" + c);
	}
	
	public static void sub() {
		System.out.println("Subtraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		sub();

		System.out.println("main method");
		
	}

}
