package interfaceAndImplementation;

public class ClassA implements InterfaceA
{

	public static void main(String[] args) 
	{
		ClassA a= new ClassA();
		a.method1();
		a.method2();
		a.methodDefault(); // default method can be called by using the object of class
		
		InterfaceA.methodstatic();// static method can be called by using the interface name
		//we cannot call static method with implementation class name
	}

	
	public void method1() 
	{
	System.out.println("Completed abstract method1 of Interface");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Completed abstract method2 of Interface");
		
	}

}
