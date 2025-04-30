package string;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer s1=new StringBuffer("Java Program");
		System.out.println("Initial Capacity: " + s1.capacity());
		System.out.println(s1.insert(4," ABCD"));
		System.out.println(s1.replace(5, 12, "language"));
		System.out.println(s1.substring(5));
		
		System.out.println(s1.substring(9, 12));
		System.out.println(s1.deleteCharAt(3));
		System.out.println(s1.delete(2, 8));
		System.out.println(s1.reverse());		
	}

}
