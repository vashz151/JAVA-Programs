import java.util.*;
public class Ch3P3
{
	public static void main(String args[])
	{
		int i,sum=0,n,sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a number:");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		for(i=0;i<=n-1;i++)
		{
			sum1+=(a[i])*(a[i]);;
		}
		System.out.println("Result="+(sum1-(sum)*(sum)));
	}
}