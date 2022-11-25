package javaBasics;

public class L3_Arithematic_Opeartors {

	public static void main(String[] args) 
	{
		int a=4;
		int b=2;
				
		//Arithmetic Operator
		//sum
		System.out.println("sum = "+(a+b));
		
		//sub
		System.out.println("sub= "+(a-b));
		
		//multiply
		System.out.println("multiply= "+(a*b));
		
		//div
		System.out.println("div= "+(a/b));
		
		//mod
		System.out.println("modulus= "+(a%b));
		
		//percentage
		System.out.println("percentage= "+((a/b)*100));
		
		//incremental a++
		System.out.println("first execution a++ = "+(a++));
		System.out.println("second execution a = "+a);
		
		//incremental ++a
		System.out.println("first execution ++a = "+(++a));
		System.out.println("second execution a = "+a);
		
		//decremental a--
		System.out.println("first dec exec a--= "+(a--));
		System.out.println("second exec a= "+a);

		//decremental --a
		System.out.println("first dec exec --a= "+(--a));
		System.out.println("second exec a= "+a);

	}

}
