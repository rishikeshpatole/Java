package javaPrograms;

import java.util.Scanner;

public class P10_LargestNoInArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array numbers : ");
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;k<a.length-1;j++)
			{
				if(a[j]==a[k])
				{
					System.out.println("the duplicate no is "+a[j]);
				}
				else
				{
					System.out.println("there is no duplicate no.");
				}
			}
		}
	}

}
