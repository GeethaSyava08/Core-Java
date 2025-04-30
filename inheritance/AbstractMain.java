package inheritance;

abstract class ParentA {
	abstract void show();//abstract method

	void method1() {// concrete method
		System.out.println("abstract class_concrete method");
	}
}

class Child1 extends ParentA {

	@Override
	void show() {
		System.out.println("implement abstract method");
	}}

class Child2 extends ParentA {

	@Override
	void show() {
		System.out.println("implement abstract method in every subclass");
	}}

public class AbstractMain {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.method1();
		c.show();

		Child2 c2 = new Child2();
		c2.show();

	}

}
