package exceptionHandling;

public class Throws {

	public static void main(String[] args) throws ArithmeticException,NullPointerException
	 {

		int i=10;
		if(i<1)
		{
		throw new NullPointerException();
	}else
	{
		throw new ArithmeticException();
	}

	 }
}
