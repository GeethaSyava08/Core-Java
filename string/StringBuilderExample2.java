package string;

public class StringBuilderExample2 {

	public static void main(String[] args) {

		
				        // Create a StringBuilder without specifying a capacity
		        StringBuilder sb = new StringBuilder();  // Default capacity is 16
		       
		        System.out.println("Initial Capacity: " + sb.capacity());   // Check initial capacity// Outputs: 16

		        // Append a large text to exceed the initial capacity
		        sb.append("This is a very long string that exceeds the default capacity of 16 characters.");

		        // Check the capacity after appending
		        System.out.println("Capacity after appending: " + sb.capacity());  // Capacity will have increased
		        
		        // Check the content
		        System.out.println("Append Text: " + sb.toString());
	}

}
