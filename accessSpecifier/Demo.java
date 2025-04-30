package accessSpecifier;

public class Demo {

	public static void main(String[] args) {
    
		Demo1 d=new Demo1();
		
		//static method should call classname.methodname
		Demo1.method1();//public static
		Demo1.method4();//protected static
		
		d.method3();//default method
		
		//d.method2();//private not accessible
	}

}
