package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a1="mom";
		String a2="omm";
		
		if(a1.length()!=a2.length())
		{
			System.out.println("given strings are not anagram");
		}else
		{
			char[] c1=a1.toCharArray();
			char[] c2=a2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b1=Arrays.equals(c1, c2);
			if(b1==true)
			{
				System.out.println("given strings are anagram");
			}else
			{
				System.out.println("given strings are not anagram");
			}
		}
	}

}
