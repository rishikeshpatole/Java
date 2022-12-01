package javaPrograms;

import java.util.Scanner;

public class P2_Armstrong_while 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num =s.nextInt();
		int temp=num;
		int length=0,add=0;
		int remain=0;
		
		while(temp>0)
		{
			temp=temp/10;
			length++;
		}
		temp=num;
		System.out.println("number length= "+length);
		
		while(temp>0)
		{
			int mul=1;
			int l=length;
			remain=temp%10;
			while(l>0)
			{
				mul=mul*remain;
				l--;
			}
			System.out.println("mul= "+mul);
			add=add+mul;
			temp=temp/10;
		}
		
		System.out.println("add="+add);
		
		if(num==add)
		{
			System.out.println(num+" is the armstrong number");
		}
		else
		{
			System.out.println(num+" is not the armstrong number");
		}
	}
}
