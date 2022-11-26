package javaBasics;

public class L6_AccessSpecifier1 
{
	public void testA()
	{
		System.out.println("This is public access specifier with green icon");
		
	}
	
	private void testB()
	{
		System.out.println("this is private access specifier with square red icon");
	}
	
	 void testC()
	{
		System.out.println("this is default access specifier with triangle blue icon");
	}
	 
	 protected void testD()
	 {
		 System.out.println(" this is protected Access Specifier with circle yellow icon");
	 }
	
	
	public static void main(String[] args) 
	{
		L6_AccessSpecifier1 obj= new L6_AccessSpecifier1 ();
		obj.testA();
		obj.testB();
		obj.testC();
		obj.testD();
	}
}
