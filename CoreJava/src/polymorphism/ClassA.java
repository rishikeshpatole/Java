package polymorphism;

public class ClassA 
{
	public static void method1()
	{
		System.out.println("This is method 1 of Class A without argument");
		System.out.println();
	}
	
	public static void method1(int i)
	{
		System.out.println("This is method 1 of Class A with integer argument");
		System.out.println();
		
	}
	
	public static void method1(String s)
	{
		System.out.println("This is method 1 of Class A with string argument");
		System.out.println();
		
	}
	
	public void method2()
	{
		System.out.println("This is method 2 of ClassA");
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		
		method1(); //method overloading
		method1(2); //method overloading
		method1("Rishikesh"); //method overloading
	}

}
