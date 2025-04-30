package string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string: ");
		String s1=sc.nextLine();
		String output="";
		
		for(int i=s1.length()-1;i>=0;i--)
			
		{
			char c1=s1.charAt(i);
			output=output+c1;
		}
		System.out.println("reversed string:" +output);
}}
