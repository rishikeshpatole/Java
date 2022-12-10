package javaPrograms;

public class P18_SortArrayInDescending 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int size= a.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
