package Assignments;

public class BlocksInJava {
	
	{
		System.out.println("IIB_1");
	}
	{
		System.out.println("IIB_2");
	}

	public static void main(String[] args) {

		System.out.println("Main method");
		
		new BlocksInJava();//object creation
		BlocksInJava b=new BlocksInJava();
		
	}
	static {
		System.out.println("SIB_1");
	}
	static {
		System.out.println("SIB_2");
	}

}
