package javaBasics;

public class L3_LogicalOperator {

	public static void main(String[] args) 
	{
		//ANDing 
		
		boolean p1= true;
		boolean p2= true;
		boolean p3= p1 && p2;
		System.out.println("p1 && p2 ="+p3);

		//ORing
		
		int a1=5;
		int a2=3;
		int a3=8;
		
		boolean r= (a1>a2) || (a3<a1);
		System.out.println("(a1>a2) || (a3<a1) = "+r);
	}

}
