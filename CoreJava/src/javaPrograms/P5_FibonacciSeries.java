package javaPrograms;

import java.util.Scanner;

public class P5_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range upto for series:");
		int range= s.nextInt();
		int a=0;
		int b=a+1;
		System.out.print(a);
		System.out.print("\t"+b);
		
		int c=0;
		int temp=a+b;
		System.out.print("\t"+temp);
		
		for(int i=b;c<range;i++)
		{
			c=b+temp;
			b=temp;
			temp=c;
			
			System.out.print("\t"+c);
		}
		
	}
}
