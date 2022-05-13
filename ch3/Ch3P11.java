import java.util.*;
public class Ch3P11
{
	public static void main(String args[])
	{
		int i,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int x[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter a value:");
			x[i]=sc.nextInt();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2;j++)
			{
				if(x[j]>x[j+1]) 
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(i=0;i<=n-1;i++)
		{
			System.out.println(x[i]);
		}
	}
}