package javaBasics;

public class L4_Variables {

	static int j;
	public static void main(String[] args) 
	{
		
		int i; //datatype variableName;
		i=10; // defining variable, variableNmae= value;
		System.out.println("i= "+i);
		
		int z= 20; //datatype variableName= value;
		System.out.println("z= "+z);
		
		System.out.println("global variable j= "+j);
		System.out.println("j="+(j=10));
		
		System.out.println("i is the local variable");
		test();
	}

	public static void test()
	{
		//  System.out.println(i);
		j=50;
		System.out.println(j);
	}
}
