package javaPrograms;

import java.util.Scanner;

public class P8_DuplicateNoInArray {

	public static void main(String[] args) 
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the array nos : ");
	int a[]=new int[5];
	int count=0;
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print("Duplicate no. is "+a[i]);
				System.out.println(" at index "+i+" and "+j);
				count++;
			}
		}
	}
	
	if(count==0)
	{
		System.out.println("there is no duplicate no.");
	}
	}
}
