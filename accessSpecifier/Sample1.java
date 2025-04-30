package accessSpecifier;

public class Sample1 {
	
	public static void method1()
	{
		System.out.println("public metod");
	}
	private void method2()
	{
		System.out.println("private method");
	}
	void method3()
	{
		System.out.println("default method");
	}
    protected static void method4() {
    	System.out.println("protected method");
		
	}
	public static void main(String[] args) {

		Sample1 s=new Sample1();
		method1();
		method4();
		s.method2();
		s.method3();
	}

}
