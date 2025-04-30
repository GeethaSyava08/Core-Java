package inheritance;
//login->searching the product->adding to the product to wishilist->cart->making payment using debit card->logout
public class HLInheritance extends LaunchQuitHLI_Parent {
	
	static void search() 
	{
		System.out.println("searching the product-child class1");
	}
	public static void main(String[] args) {
		
		login();
		search();
		logout();
	}

	
}
