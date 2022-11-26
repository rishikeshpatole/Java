package polymorphism;

public class ClassB {
	
	public static void method1()
	{
		System.out.println(" this is the method1 of Class B");
	}

	public void method2()
	{
		System.out.println("This is the method 2 of Class B");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		ClassB b=new ClassB();
		b.method2();
		
		ClassA a= new ClassA();
		a.method2();
		
		method1();
	}

}
