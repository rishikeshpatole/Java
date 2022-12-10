package javaPrograms;

public class P16_1_PrimeNosInRange 
{
	public static void main(String[] args) 
	{
		int range=50;
		int temp=0;
		
		for(int i=2;i<=range;i++)
		{
			//System.out.println(i);
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp!=0)
			{
			//	System.out.println("the no is not prime no");
				temp=0;
			}
			else
			{
				System.out.println(i+" is Prime no.");
			}
		}
	}
}
