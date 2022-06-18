import java.util.*;
public class Test1
{
	public static void main(String args[])
	{
		int n,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter an element:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n-2;i++) 
		{
			for(j=0;j<=n-2-i;j++) 
			{
				if(a[j]<a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array sorted in descending order is as follows:");
		for(i=0;i<=n-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}