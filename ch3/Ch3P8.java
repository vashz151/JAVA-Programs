import java.util.*;
public class Ch3P8
{
	public static void main(String args[])
	{
		int i,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int x[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a value:");
			x[i]=sc.nextInt();
		}
		for(i=0;i<=n/2-1;i++)
		{
			temp=x[i];
			x[i]=x[n-i-1];
			x[n-1-i]=temp;
		}
		System.out.println("Reverse array:");
		for(i=0;i<=n-1;i++)
		{
			System.out.println(x[i]);
		}
	}
}