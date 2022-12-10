package javaPrograms;

import java.util.Scanner;

public class P21_ReverseStringUsingScanner 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String value: ");
		String s1=s.nextLine();
		//System.out.println(s1);
		String a[]= s1.split(" ");
		String reverse="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			reverse=reverse+a[i]+" ";
		}
		
		System.out.println(reverse);
		
	}

}
