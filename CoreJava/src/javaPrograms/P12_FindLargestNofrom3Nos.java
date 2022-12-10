package javaPrograms;

import java.util.Scanner;

public class P12_FindLargestNofrom3Nos 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values :");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else if(a<b)
		{
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
	}

}
