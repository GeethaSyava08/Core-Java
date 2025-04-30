package inheritance;

public interface MultipleLevel2 {

	abstract void sub();
	
	default void disp()
	{
		System.out.println("default method");
	}
}
