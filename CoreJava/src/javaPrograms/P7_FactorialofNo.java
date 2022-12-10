package javaPrograms;

import java.util.Scanner;

public class P7_FactorialofNo 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=s.nextInt();
		int temp=num;
		int mul=1;
		for(int i=1;i<=temp;i++)
		{
			mul=mul*i;
		}
		System.out.println("Factorial of "+num+" is "+mul);
	}

}
