package abstractAndConcerete;

public class ClassB extends ClassA 
{
	
	
	public static void main(String[] args) 
	{
		ClassB b= new ClassB();
		b.method2();
		
		
	}

	public void method2() 
	{
	System.out.println("this is the concrete class");
	System.out.println("We have completed the abstract method of Class A");
	}

}
