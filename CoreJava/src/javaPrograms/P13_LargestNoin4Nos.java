package javaPrograms;

import java.util.Scanner;

public class P13_LargestNoin4Nos 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the values: ");
		int a=s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		int d= s.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A is greater");
				}
				else
				{
					System.out.println("D is greater");
				}
				
			}
			else if(a<c)
			{
				if(c>d)
				{
					System.out.println("C is greater");
				}
				else
				{
					System.out.println("D is greater");
				}
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("B is greater");
				}
				else
				{
					System.out.println("D is greater");
				}
			}
			else if(c>d)
			{
				System.out.println("C is greater");
			}
			else
			{
				System.out.println("D is greater");
			}
		}
	}

}
