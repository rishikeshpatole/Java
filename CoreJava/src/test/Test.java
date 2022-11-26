package test;

import javaBasics.L6_AccessSpecifier1;


public class Test extends L6_AccessSpecifier1
{
	public static void main(String[] args) 
	{
		System.out.println("Creating the objecct of same class");
		Test object= new Test();
		object.testA();
		
		object.testD();
		
	}
}
