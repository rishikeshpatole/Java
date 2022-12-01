package javaPrograms;

public class P28_StarPattern_Pyramid {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=rows-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
