package interfaceAndImplementation;

public interface InterfaceA 
{
	public abstract void method1();
	public abstract void method2();
	
	public static void methodstatic()
	{
		System.out.println("static method of interface");
	}
	
	public default void methodDefault()
	{
		System.out.println("Default method of interface");
	}
	
}
