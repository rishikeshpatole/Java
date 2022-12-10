package javaPrograms;

import java.util.Scanner;

public class P6_ConvertStringIntoSequenceOfCharcter 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string value: ");
		String str= s.nextLine();
		
		char c[]=str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println("the char at index "+i+" is "+c[i]);
		}
	}

}
