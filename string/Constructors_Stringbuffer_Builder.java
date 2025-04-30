package string;

public class Constructors_Stringbuffer_Builder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();// Default capacity is 16
		StringBuilder sb2 = new StringBuilder(100);
		StringBuilder sb3 = new StringBuilder("Hello");
		 System.out.println("Initial Capacity: " + sb.capacity());
	        System.out.println(sb3);

		
		StringBuffer s=new StringBuffer();
		StringBuffer s2 = new StringBuffer(50); 
		StringBuffer s3 = new StringBuffer("java");
        System.out.println("Initial Capacity of string buffer " + s.capacity());
        
        System.out.println(s3);
        
        
	       
	}

}
