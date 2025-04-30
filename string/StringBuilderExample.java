package string;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder s=new StringBuilder("Testing");
		System.out.println("Initial Capacity: " + s.capacity());
		System.out.println(s.append(" Automation"));
		System.out.println(s);
		System.out.println(s.indexOf("e"));
		System.out.println(s.insert(7, " API"));
		System.out.println(s.delete(2, 10));
		System.out.println(s.replace(2, 5, "java"));
		
	}

}
