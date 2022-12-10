package javaPrograms;

public class P20_ReverseTheString 
{
	public static void main(String[] args) 
	{
		String s= "Rishikesh is Best";
		String s1[]=s.split("\\s");
		String reverse="";
		
		for(int i=s1.length-1;i>=0;i--)
		{
			reverse= reverse+s1[i]+" ";
		}
		
		System.out.println(reverse);
		
	}
}
