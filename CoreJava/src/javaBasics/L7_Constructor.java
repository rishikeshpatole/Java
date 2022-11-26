package javaBasics;

public class L7_Constructor 
{
	public L7_Constructor() 
	{
		int x=10;
		System.out.println("this is the constructor");
	}
	
	public L7_Constructor(int i)
	{
		System.out.println("this is the with argument constructor");
	}
	
	public static void main(String[] args) 
	{
		L7_Constructor obj= new L7_Constructor();// without argument user defined constructor
		
		L7_Constructor obj1= new L7_Constructor(2);// with argument user defined constructor
	}

}
