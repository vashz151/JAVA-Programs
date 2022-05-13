import java.util.*;
public class Ch3P4
{
	public static void main(String args[])
	{
		int i,sum=0,n;
		float avg,sd=0;
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
		avg=(float)sum/n;
		for(i=0;i<=n-1;i++)
		{
			sd=sd+(a[i]-avg)*(a[i]-avg);
		}
		sd=(float)Math.sqrt(sd/n);
		System.out.println("Std Dev="+sd);
	}
}