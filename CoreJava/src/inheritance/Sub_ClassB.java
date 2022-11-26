package inheritance;

public class Sub_ClassB extends Super_ClassB 
{
	public void method1()
	{
		System.out.println(" this is method1 of Sub_ClassB");
	}

	public static void main(String[] args) 
	{	
		Sub_ClassB subB= new Sub_ClassB();
		subB.method1();
		method2();//Hierarchical inheritance	
	}

}
