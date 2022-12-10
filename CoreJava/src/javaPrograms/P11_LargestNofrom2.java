package javaPrograms;

import java.util.Scanner;

public class P11_LargestNofrom2 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 nos: ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater ");
		}
		else
		{
			System.out.println("B is greater ");
		}
	}
}
