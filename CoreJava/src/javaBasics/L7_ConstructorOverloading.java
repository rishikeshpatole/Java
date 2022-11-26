package javaBasics;

public class L7_ConstructorOverloading 
{
	public L7_ConstructorOverloading()
	{
		System.out.println("This is zero argument constructor");
	}
	
	public L7_ConstructorOverloading(int i)
	{
		System.out.println("This is argument constructor");
		System.out.println("with integer value "+i);
	}
	
	public L7_ConstructorOverloading(int i, String s)
	{
		System.out.println("This is argument constructor");
		System.out.println("with integer "+i+" and String value "+s);
	}
	
	public static void main(String[] args) 
	{
		L7_ConstructorOverloading obj1= new L7_ConstructorOverloading(); //zero argument
		
		L7_ConstructorOverloading obj2= new L7_ConstructorOverloading(1); //arg constructor
		
		L7_ConstructorOverloading obj3= new L7_ConstructorOverloading(2, "Rishikesh");//arg constructor
	}
}
