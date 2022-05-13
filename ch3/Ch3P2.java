import java.util.*;
public class Ch3P2
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a value:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n-1;i++)
		{
			sum+=a[i];
		}
		avg=(float)sum/n;
		System.out.println("Average="+avg);
	}
}