package string;

public class StringFunctions {

	public static void main(String[] args) {

		String s="Java21";
		int length=s.length();
		System.out.println(length);
			
		
		String lowercase=s.toLowerCase();
		String upercase=s.toUpperCase();
		System.out.println("lowercase:" +lowercase);
		System.out.println("upercase:" +upercase);
		
		String s1="  Geetha    ";
		String t=s1.trim(); 
		System.out.println(t);
	}

}
