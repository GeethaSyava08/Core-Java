package inheritance;

abstract class Order {

	abstract void disp();
	abstract void select();

	void cart() {
		System.out.println("added to cart_concrete method");
	}}

public class AbstractClass extends Order {

	@Override
	void disp() {
		System.out.println("search the product");
	}

	@Override
	void select() {
		System.out.println("select the product");
	}

	public static void main(String[] args) {

		AbstractClass a=new AbstractClass();
		a.cart();
		a.disp();
		a.select();
	}

}
