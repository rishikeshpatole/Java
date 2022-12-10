package javaPrograms;

import java.util.Scanner;

public class P15_FindthePalindromeNo 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no: ");
		int i=s.nextInt();
		int temp=i;
		int remain=0;
		int pal=0;
		
		while(temp!=0)
		{
			remain=temp%10;
			pal=(pal*10)+remain;
			temp=temp/10;
		}
		
		System.out.println(pal);
		
		if(i==pal)
		{
			System.out.println("this is the palindrome no.");
		}
		else
		{
			System.out.println("the no. is no the palindrome no.");
		}
	}

}
