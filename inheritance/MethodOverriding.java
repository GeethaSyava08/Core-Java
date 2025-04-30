package inheritance;

class GrandParent {
	void disp() {

		System.out.println("method1-Grand parent");
	}

	static void add() {
		System.out.println("static m1");
	}
}

class Parent extends GrandParent {

	void disp() {
		super.disp();
		System.out.println("method2_parent");

	}
}

public class MethodOverriding extends Parent {

	void display()

	{
		super.disp();
		System.out.println("method3_child");

	}

	public static void main(String[] args) {

		MethodOverriding m = new MethodOverriding();
		m.display();
		add();

	}

}
