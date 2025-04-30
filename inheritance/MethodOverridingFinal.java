package inheritance;

class ParentF {
	final void display() {
		System.out.println("final method");

	}
}

class ChildF extends ParentF {
	// void display() {} //compilation error

	static void disp() {
		System.out.println("static method");
	}
}

public class MethodOverridingFinal extends ChildF {

	public static void main(String[] args) {

		final int num = 10;
		// num=20; //compilation error

		System.out.println("final variable value=" + num);
		MethodOverridingFinal m = new MethodOverridingFinal();
		m.display();
		disp();

	}

}
