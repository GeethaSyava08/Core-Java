package inheritance;

class Class1 {

	void method1() {
		this.method2(34);
		System.out.println("method1_non para");
	}

	void method2(double d) {
		
		System.out.println("method 2_para");
	}

}

class Class2 extends Class1 {
	Class2() {
		//super.method1();
		
		System.out.println("parent constructor");
	}

	Class2(int a) {
		this();
		
		System.out.println("parameterized constructor");

	}
}

public class SuperCalling extends Class2
{
SuperCalling()
{
	super(45);
	System.out.println("child constructor2");
}
	public static void main(String[] args) {
		
		
		SuperCalling s=new SuperCalling();
		s.method1();
		
	}

}
