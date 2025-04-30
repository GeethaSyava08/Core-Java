package string;

import java.util.Arrays;

public class ReplaceString {

	public static void main(String[] args) {

		String s = "Automation Testing java";

		String []input=s.split(" ");
		System.out.println(Arrays.toString(input));
		
		String input1[]=s.split(" ",3);
		System.out.println(Arrays.toString(input1));
				
		String output = s.replace('u', 'a');
		System.out.println(output);

		String output1 = s.replace("automation", "API");
		System.out.println(output1);

		String output3 = s.replaceAll("[A-Z]", "");
		System.out.println(output3);

		String output4 = s.replaceAll("[a-z]", "");
		System.out.println(output4);

		boolean b1 = s.endsWith("d");
		System.out.println(b1);

		int i = s.lastIndexOf('u');
		System.out.println(i);

		boolean b2 = s.isEmpty();
		System.out.println(b2);
		
		String sb=s.substring(2);
		System.out.println(sb);

	}

}
