package inheritance;

public class Super_ClassB extends Sub_ClassA
{
	public void method1()
	{
		System.out.println("this is method1 of SuperClassB ");
		System.out.println();
	}
	
	public static void method2()
	{
		System.out.println("this is the static method2 for SuperClassB");
	}
	
	public static void main(String[] args) 
	{
		Super_ClassB SupB= new Super_ClassB();
		SupB.method1();
	//	SupB.main(args);
		
		Sub_ClassA subA= new Sub_ClassA();
		subA.method1();//multi level Inheritance
		subA.method2();//multilevel Inheritance
	}
}	
