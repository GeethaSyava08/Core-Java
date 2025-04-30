package inheritance;
//login->profile editing->cancelling previously placed order->logout
public class HLInheriatnce2 extends LaunchQuitHLI_Parent {

	void edit()
	{
		System.out.println("profile editing-child class 2");
	}
	
	public static void main(String[] args) {
		
		login();
		HLInheriatnce2 h=new HLInheriatnce2();
		h.edit();
		logout();
		
	}
}
