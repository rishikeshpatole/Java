package javaPrograms;

public class P30_StarPattern_1st_4rth_quad 
{
	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=0;l<=rows;l++)
		{
			for(int k=rows;k>=l;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
