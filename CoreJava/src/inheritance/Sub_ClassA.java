package inheritance;

public class Sub_ClassA extends Super_ClassA
{
	public void method1()
	{
		System.out.println(" this is method1 of Sub_ClassA");
		System.out.println();
	}

	public static void main(String[] args)
	{
	
		Sub_ClassA subA= new Sub_ClassA();
		subA.method1();
	
		Super_ClassA SupA= new Super_ClassA();
		SupA.method1();// single level inheritance
		
		method2();//single level inheritance for static method
	}
}
