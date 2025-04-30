package string;

public class StringFunctions2 {

	public static void main(String[] args) {

		String s = "kriti";
		boolean b = s.equals("Kriti");
		System.out.println(b);

		boolean b1 = s.equalsIgnoreCase("KRITI");
		System.out.println(b1);

		String s1 = "string functions ";
		boolean b2 = s1.contains("functions");
		System.out.println(b2);

		String c = s1.concat(s);
		System.out.println(c);

		int i = s.indexOf('i');
		System.out.println("index of i= " + i);

		int l = s.lastIndexOf('i');
		System.out.println(l);

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(2, 5));

		System.out.println(s1.repeat(3));

		boolean b3 = s.isEmpty();
		System.out.println(b3);
		char x = s.charAt(0);
		System.out.println(x);

	}

}
