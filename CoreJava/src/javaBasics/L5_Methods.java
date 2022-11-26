package javaBasics;

public class L5_Methods 
{
	public void testA()
	{
		System.out.println();
		System.out.println("Need to create the class object....Object are used to load the nonstatic elements...");
		System.out.println("It is the instance of the class");
		System.out.println("This is the Non static method");
		System.out.println();
	}
	
	public static void testB()
	{
		System.out.println("This is a Static Method");
	}
	
	public static void main(String[] args) 
	{
		L5_Methods object= new L5_Methods();
		
		testB();
		object.testA();
	}
}
