import java.util.*;
public class Ch3P1
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a value:");
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in the array are:");
		for(i=0;i<=n-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}