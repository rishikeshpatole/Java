package javaPrograms;

import java.util.Scanner;

public class P16_FindPrimeNo 
{
	public static void main(String[] args) 
	{
		int num=31;
		int temp=0;
		
		for(int i=2;i<num;i++)
		{
			int r=num%i;
			if(r==0)
			{
				temp=temp+1;
			}
			
		}
		
		if(temp!=0)
		{
			System.out.println(num+" is not the Prime no");
			temp=0;
		}
		else 
		{
			System.out.println(num+" is prime number");
		}
	}
}
