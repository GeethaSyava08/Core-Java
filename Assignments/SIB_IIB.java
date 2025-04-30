package Assignments;

public class SIB_IIB {
	static int a;
	 int b;
	
	static {
		a=10;
		System.out.println("SIB----" +a);
	}
	{
		b=20;
		System.out.println("IIB----" +b);
	}
	SIB_IIB()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) {

		System.out.println("main method executed");
		SIB_IIB s=new SIB_IIB();//runs IIB and constructor
		SIB_IIB s1=new SIB_IIB();//runs IIB and constructor
		
	}

}
