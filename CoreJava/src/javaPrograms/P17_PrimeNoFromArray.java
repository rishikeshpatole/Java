package javaPrograms;

public class P17_PrimeNoFromArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		int size=a.length;
		int temp=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp!=0)
			{
				//System.out.println("no is not prime");
				temp=0;
			}
			else if(a[i]!=1 && a[i]!=0)
			{
				System.out.println(a[i]+" is prime no");
			}
		}
	}

}
