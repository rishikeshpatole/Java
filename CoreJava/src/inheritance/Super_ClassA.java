package inheritance;

public class Super_ClassA 
{
	public void method1()
	{
		System.out.println("this is method1 of Non Static method of SuperClassA ");
		System.out.println();
	}
	
	public static void method2()
	{
		System.out.println(" this is the static method of SuperClassA");
	}
	
	public static void main(String[] args) 
	{
		Super_ClassA SupA= new Super_ClassA();
		SupA.method1();		
	}
}
