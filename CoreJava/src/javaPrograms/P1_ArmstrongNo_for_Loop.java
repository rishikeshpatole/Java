package javaPrograms;

import java.util.Scanner;

public class P1_ArmstrongNo_for_Loop 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number =");
		int num= s.nextInt();
		
		int temp=num;
		int temp2=num;
		int count=0;
		int remain=0;
		
		int add=0;
		
		for(int i=0;temp>0;i++)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("count= "+count);
		
		
		for(int j=count;j>0;j--)
		{
			int mul=1;
			remain=temp2%10;
			System.out.println("remain "+remain);
			for(int k=0;k<count;k++)
			{
				mul=mul*remain;
			}
			System.out.println("mul= "+mul);
			add=add+mul;
			temp2=temp2/10;
		}
		System.out.println(add);
		
		if(num==add)
		{
			System.out.println(num+" is armstrong no");
		}
		else
		{
			System.out.println(num+ " is not armstrong number");
		}
	}

}
