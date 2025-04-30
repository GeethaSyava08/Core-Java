package exceptionHandling;

public class Exception_Handling {

	public static void main(String[] args) {
try {
	

		String str="null";
		int a=10/0;
}
catch(ArithmeticException | NullPointerException n)
{
	//System.out.println("Error:" +n.getMessage());
	System.out.println("error:  value by zero");
}
		
	}

}
