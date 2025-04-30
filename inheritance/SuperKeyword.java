package inheritance;

class Mother {

	void method1() {
		System.out.println("method1");
	}
}

class Daughter extends Mother {

	public Daughter() {
		// constructor

		System.out.println("constructor");// 1
	}

	@Override
	void method1() {

		System.out.println("method1 in daughter");
	}

	void method2() {
		super.method1();
		System.out.println("method2");
	}
}

public class SuperKeyword extends Daughter {

	@Override
	void method1() {
		super.method1();
		System.out.println("child class");
	}

	public SuperKeyword() {// constructor

		System.out.println("child class constructor"); // 2
	}

	public static void main(String[] args) {

		SuperKeyword s = new SuperKeyword(); // constructor called automatically
		s.method1();
		s.method2();

	}

}
