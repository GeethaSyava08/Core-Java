package inheritance;

public class InterfaceB implements InterfaceA {
	@Override
	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("overriding abstract method1");
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		System.out.println("overriding abstract method2");
		return 42;
	}

	public static void main(String[] args) {

		InterfaceB s = new InterfaceB();
		s.method1();
		int res = s.method2();
		System.out.println(res);

	}

}
