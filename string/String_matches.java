package string;

public class String_matches {

	public static void main(String[] args) {

		String s1="care ";
		//1st check if the given string consist of exact 4letters in it or not
		boolean b1=s1.matches("....");
		System.out.println(b1);
		//check if string starts with c
		boolean b2=s1.matches("c(.*)");
		System.out.println(b2);
		
		//check if the string ends with e
		boolean b3=s1.matches("(.*)e");
		System.out.println(b3);
		
		String s2="salmankhan";
		boolean b4=s2.matches("(.*)man(.*)");
		System.out.println(b4);
		
		String repeat=s1.repeat(4);
		System.out.println(repeat);
		
	}

}
