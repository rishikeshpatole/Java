package javaPrograms;

import java.util.Scanner;

public class P9_FindDuplicateStringFromArray {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string of array");
		String a[]=new String[6];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
				{
					System.out.println("duplicate string is "+a[j]);
					count++;
				}
				
			}
		}
		
		if(count==0)
		{
			System.out.println("there is no duplicate string");
		}

	}

}
